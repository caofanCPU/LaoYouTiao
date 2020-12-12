package com.bitfly.platform.laoyoutiao.action;

import com.bitfly.platform.laoyoutiao.util.CollectionUtil;
import com.bitfly.platform.laoyoutiao.util.ConstantUtil;
import com.bitfly.platform.laoyoutiao.util.VerbalExpressionUtil;
import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.intellij.openapi.project.Project;
import lombok.NonNull;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * Make Ascii text graph easy enough
 *
 * @author D8GER
 */
public class GraphEasyAction extends AnAction {

    /**
     * Convert ascii text graph definition, such as
     * C.mapper.List[D].classify.Map<F, List[G]>
     * |
     * v
     * [C]-- mapper -->[List\[D\]]-- classify -->[Map\<F, List\[G\]\>]
     *
     * @param source
     * @return
     */
    public static String convertGraphEasyDSL(String source) {
        String[] split = source.split(VerbalExpressionUtil.NEXT_LINE_REGEX.pattern());
        List<String> resultList = new ArrayList<>();
        for (String defineText : split) {
            String initGraphEasy = defineText.replaceAll(VerbalExpressionUtil.CODE_NOTE_REGEX.pattern(), ConstantUtil.EMPTY)
                    .replaceAll(VerbalExpressionUtil.KEY_COLLECTION_EDGE_SYMBOL_REGEX.pattern(), ConstantUtil.DOUBLE_ESCAPES + VerbalExpressionUtil.REPLACE_MATCH_RESULT_SYMBOL);
            String[] elements = initGraphEasy.split(VerbalExpressionUtil.KEY_ENGLISH_DOT_REGEX.pattern());
            StringBuilder itemResult = new StringBuilder(ConstantUtil.EMPTY);
            for (int i = 0; i < elements.length; i++) {
                if (i % 2 == 0) {
                    // this is graph node
                    itemResult.append(ConstantUtil.ENGLISH_MID_LEFT_BRACKET).append(elements[i]).append(ConstantUtil.ENGLISH_MID_RIGHT_BRACKET);
                } else {
                    // this is graph edge with it's note
                    itemResult.append(ConstantUtil.FILL_EMPTY_PLACE_HOLDER).append(ConstantUtil.SPACE).append(elements[i]).append(ConstantUtil.SPACE).append(ConstantUtil.FILL_EMPTY_PLACE_HOLDER).append(ConstantUtil.GREATER);
                }
            }
            resultList.add(itemResult.toString());
        }
        return CollectionUtil.join(resultList, ConstantUtil.TAB);
    }

    /**
     * Execute /usr/local/bin/graph-easy for the final result
     *
     * @param graphEasyDsl
     * @return
     */
    public static String graphEasyView(String graphEasyDsl) {
        String graphEasyHome = "/usr/local/bin/graph-easy";
        String command = "echo \"" + graphEasyDsl + "\" | " + graphEasyHome;
        String helpMessage = "If you get nothing changed, here is the checklist: \n"
                + "1.In your terminal, try: echo \"" + graphEasyDsl + "\" | " + graphEasyHome + "\n"
                + "2.If you stocked, click <b><a href='https://github.com/caofanCPU/LaoYouTiao'>here</a><b> for help";
        String commentFlag = ConstantUtil.ENGLISH_STOP + ConstantUtil.SPACE;
        String replacement = VerbalExpressionUtil.REPLACE_MATCH_RESULT_SYMBOL + ConstantUtil.TAB + ConstantUtil.SPACE + ConstantUtil.COMMENT_STAR + ConstantUtil.SPACE + commentFlag;
        String shell = "/bin/zsh";
        String executeFlag = "-c";
        ProcessBuilder processBuilder = new ProcessBuilder(shell, executeFlag, command);
        String errorMessage;
        try {
            Process process = processBuilder.start();
            String shellResult = IOUtils.toString(process.getInputStream(), StandardCharsets.UTF_8);
            if (StringUtils.isNotBlank(shellResult)) {
                return commentFlag + shellResult.replaceAll(VerbalExpressionUtil.NEXT_LINE_REGEX.pattern(), replacement);
            }
            errorMessage = IOUtils.toString(process.getErrorStream(), StandardCharsets.UTF_8);
        } catch (Throwable e) {
            // notify
            errorMessage = e.getMessage();
        }
        if (StringUtils.isNotBlank(errorMessage)) {
            helpMessage += ("\nTHE ERROR IS: " + errorMessage);
        }
        Notifications.Bus.notify(
                new Notification(ConstantUtil.NOTIFICATION_GROUP_VIEW_ID,
                        "Something went wrong, please check",
                        helpMessage,
                        NotificationType.ERROR
                )
        );
        return null;
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        final Editor currentEditor = e.getRequiredData(CommonDataKeys.EDITOR);
        final Project currentProject = e.getRequiredData(CommonDataKeys.PROJECT);
        final Document currentDocument = currentEditor.getDocument();
        final SelectionModel selectionModel = currentEditor.getSelectionModel();

        // Perform a refresh of the current file
        WriteCommandAction.runWriteCommandAction(currentProject, () -> executeGraphEasyRender(currentDocument, selectionModel));
    }

    /**
     * Rewrite files for easy graph dsl
     *
     * @param currentDocument
     * @param selectionModel
     */
    private void executeGraphEasyRender(@NonNull Document currentDocument, @NonNull SelectionModel selectionModel) {
        String sectionText = selectionModel.getSelectedText();
        if (StringUtils.isNotBlank(sectionText)) {
            String graphEasyDSL = convertGraphEasyDSL(sectionText);
            String replacement = graphEasyView(graphEasyDSL);
            if (StringUtils.isNotBlank(replacement)) {
                currentDocument.replaceString(selectionModel.getSelectionStart(), selectionModel.getSelectionEnd(), replacement);
            }
        } else {
            String graphEasyDSL = convertGraphEasyDSL(currentDocument.getText());
            String replacement = graphEasyView(graphEasyDSL);
            if (StringUtils.isNotBlank(replacement)) {
                currentDocument.setText(replacement);
            }
        }
    }

}
