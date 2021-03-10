package com.bitfly.platform.laoyoutiao.action;

import com.bitfly.platform.laoyoutiao.core.TimeCalculateEnum;
import com.bitfly.platform.laoyoutiao.util.CollectionUtil;
import com.bitfly.platform.laoyoutiao.util.ConstantUtil;
import com.bitfly.platform.laoyoutiao.util.DateUtil;
import com.bitfly.platform.laoyoutiao.util.VerbalExpressionUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Wonderful time calculate alt + shift + ctl + 'H'
 *
 * @author caofanCPU
 */
public class TimeEstimateAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        final Editor currentEditor = e.getRequiredData(CommonDataKeys.EDITOR);
        final Project currentProject = e.getRequiredData(CommonDataKeys.PROJECT);
        final Document currentDocument = currentEditor.getDocument();
        final SelectionModel selectionModel = currentEditor.getSelectionModel();

        // Perform a refresh of the selected words
        WriteCommandAction.runWriteCommandAction(currentProject, () -> executeTimeEstimate(currentDocument, selectionModel));
    }

    /**
     * Rewrite files for removing whitespace and reducing to one line
     *
     * @param currentDocument
     * @param selectionModel
     */
    private void executeTimeEstimate(@NonNull Document currentDocument, @NonNull SelectionModel selectionModel) {
        if (!selectionModel.hasSelection()) {
            selectionModel.selectWordAtCaret(true);
        }

        int selectionStart = selectionModel.getSelectionStart();
        int selectionEnd = selectionModel.getSelectionEnd();
        String originWord = currentDocument.getText(new TextRange(selectionStart, selectionEnd));
        String replacement = handleReplacement(originWord);
        currentDocument.replaceString(selectionStart, selectionEnd, replacement);
        selectionModel.removeSelection();
    }

    /**
     * TimeStamp - LocalDateTime
     *
     * @param originWord
     * @return
     */
    private String handleReplacement(@NonNull String originWord) {
        LocalDateTime now = LocalDateTime.now();
        Long current = DateUtil.getMilliseconds(now);
        StringBuilder result = new StringBuilder();
        String text = VerbalExpressionUtil.cleanWhiteChar(originWord);
        if (StringUtils.isBlank(text) || !VerbalExpressionUtil.TIME_CALCULATE.matcher(text).matches()) {
            if (StringUtils.isNotBlank(text)) {
                result.append("legal input: " + originWord + "\n");
            }
            result.append("Usage: the shortcut will always tell you current time like this: now()=").append(current).append(", viewNow()=").append(DateUtil.enhanceToLocalDateTime(current)).append("\n")
                    .append(ConstantUtil.TAB + "'+' or '-'(default) specified the increase or decrease operation to be done for the current time;\n")
                    .append(ConstantUtil.TAB + "'Y'=Year, 'M'=Month, 'd'=day, 'h'=hour, 'm'=minute, 's'=second, default millisecond and you needn't input;\n")
                    .append(ConstantUtil.TAB + "for example: +10Y9M8d7h6m54s321 means current time should execute: +10years+9months+8days+7hours+6minutes+54seconds+321milliseconds\n")
                    .append(ConstantUtil.TAB + "ATTENTION: DO NOT REPEAT FOR A SAME TIME UNIT like 2d3m4d5d9m and so on, if you do this,\n")
                    .append(ConstantUtil.TAB + "REMEMBER THAT only THE FIRST PARAM is useful and others will be ignored, and so the result will be 2d3m \n");
            return result.toString();
        }
        boolean helpMsg4Override = false;
        Map<TimeCalculateEnum, Integer> paramMap = new HashMap<>(16, 0.75f);
        StringBuilder weightBuilder = new StringBuilder();
        TimeCalculateEnum timeCalculate = null;
        for (char item : text.toCharArray()) {
            if (item >= '0' && item <= '9') {
                weightBuilder.append(item);
                continue;
            }
            // with time unit flag, store weight
            timeCalculate = CollectionUtil.findAnyInArrays(TimeCalculateEnum.values(), TimeCalculateEnum::getKey, item);
            if (Objects.nonNull(timeCalculate)) {
                if (Objects.nonNull(paramMap.get(timeCalculate))) {
                    // override happened
                    helpMsg4Override = true;
                }
                // consider user typing double letters is more possible, therefore restricting subsequent input is invalid
                paramMap.putIfAbsent(timeCalculate, parseWeight(weightBuilder.toString()));
            }
            // clear previous number param
            if (StringUtils.isNotEmpty(weightBuilder)) {
                weightBuilder.delete(0, weightBuilder.length());
            }
        }
        if (StringUtils.isNotEmpty(weightBuilder)) {
            // if text end with some digits, it means time unit is milliseconds as default
            paramMap.putIfAbsent(TimeCalculateEnum.MILLISECOND, parseWeight(weightBuilder.toString()));
        }
        LocalDateTime resultTime;
        int year = paramMap.getOrDefault(TimeCalculateEnum.YEAR, 0);
        int month = paramMap.getOrDefault(TimeCalculateEnum.MONTH, 0);
        int day = paramMap.getOrDefault(TimeCalculateEnum.DAY, 0);
        int hour = paramMap.getOrDefault(TimeCalculateEnum.HOUR, 0);
        int minute = paramMap.getOrDefault(TimeCalculateEnum.MINUTE, 0);
        int second = paramMap.getOrDefault(TimeCalculateEnum.SECOND, 0);
        int millisecond = paramMap.getOrDefault(TimeCalculateEnum.MILLISECOND, 0);
        boolean add = Objects.nonNull(paramMap.get(TimeCalculateEnum.PLUS)) && Objects.isNull(paramMap.get(TimeCalculateEnum.MINUS));
        char operate = add ? TimeCalculateEnum.PLUS.getKey() : TimeCalculateEnum.MINUS.getKey();
        if (add) {
            // add time
            resultTime = now.plusYears(year).plusMonths(month).plusDays(day).plusHours(hour).plusMinutes(minute).plusSeconds(second).plusNanos(millisecond * 1000000L);
        } else {
            resultTime = now.minusYears(year).minusMonths(month).minusDays(day).minusHours(hour).minusMinutes(minute).minusSeconds(second).minusNanos(millisecond * 1000000L);
        }
        Long resultMilliseconds = DateUtil.getMilliseconds(resultTime);
        if (helpMsg4Override) {
            result.append("ATTENTION: REPEAT A SAME TIME UNIT!\n");
        }
        result.append("now()=").append(current).append(", viewNow()=").append(DateUtil.enhanceToLocalDateTime(current)).append("\n")
                .append("parse info: ").append(operate)
                .append(year).append(TimeCalculateEnum.YEAR.getKey())
                .append(month).append(TimeCalculateEnum.MONTH.getKey())
                .append(day).append(TimeCalculateEnum.DAY.getKey())
                .append(hour).append(TimeCalculateEnum.HOUR.getKey())
                .append(minute).append(TimeCalculateEnum.MINUTE.getKey())
                .append(second).append(TimeCalculateEnum.SECOND.getKey())
                .append(TimeCalculateEnum.MILLISECOND.getKey()).append(millisecond).append("\n")
                .append("operate is time").append(operate).append("\n")
                .append("result()=").append(resultMilliseconds).append(", viewResult()=").append(DateUtil.enhanceToLocalDateTime(resultMilliseconds)).append("\n");
        return result.toString();
    }

    public Integer parseWeight(String param) {
        try {
            return Integer.parseInt(param);
        } catch (NumberFormatException e) {
            // ignore, just return zero
            return 0;
        }
    }
}
