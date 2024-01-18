package com.atguigu.schedule.common;

/**
 * ClassName: ResultCodeEnum
 * Package: com.atguigu.schedule.common
 * Description:
 *
 * @author sichen
 * @version 1.0
 * @create 1/18/24 12:39 PM
 */
public enum ResultCodeEnum {
    SUCCESS(200, "success"),
    USERNAME_ERROR(501, "usernameERROR"),
    PASSWORD_ERROR(503, "passwordError"),
    NOTLOGIN(504, "notlogin"),
    USERNAME_USED(505, "usernameUsed");
    private Integer code;
    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

