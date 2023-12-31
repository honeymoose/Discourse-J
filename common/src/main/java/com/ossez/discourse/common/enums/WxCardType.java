package com.ossez.discourse.common.enums;

/**
 * 微信卡券
 *
 * @author YuCheng
 */
public enum WxCardType {
    MEMBER_CARD("MEMBER_CARD"),
    GROUPON("GROUPON"),
    CASH("CASH"),
    DISCOUNT("DISCOUNT"),
    GIFT("GIFT"),
    GENERAL_COUPON("GENERAL_COUPON");

    private String code;

    WxCardType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
