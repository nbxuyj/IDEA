package com.xuyj.platform.common.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {
    ERROR(-1, "其他错误"),
    SUCCESS(0, "成功"),
    NO_LOGIN(1000, "请先登录");

    private int code;
    private String message;
}
