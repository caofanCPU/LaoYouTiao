package com.bitfly.platform.laoyoutiao.core;

/**
 * EasterEgg code template keyword enumeration
 *
 * @author caofanCPU
 */
public enum EasterEggCodeTemplateEnum {
    REGEX_CONFIG_FILE_KEY("REGEX", AutoCodeTemplate.TEMPLATE_REGEX),
    OH_MY_ZSH_CONFIG_FILE_KEY("OHMYZSH", AutoCodeTemplate.TEMPLATE_OH_MY_ZSH),
    END_CONFIG_FILE_KEY("END", AutoCodeTemplate.TEMPLATE_END),


    NASA_CONFIG_FILE_KEY("NASA", AutoCodeTemplate.TEMPLATE_NASA),
    ;


    private final String codeKey;

    private final String templateCode;

    EasterEggCodeTemplateEnum(String codeKey, String templateCode) {
        this.codeKey = codeKey;
        this.templateCode = templateCode;
    }

    public String getCodeKey() {
        return codeKey;
    }

    public String getTemplateCode() {
        return templateCode;
    }
}
