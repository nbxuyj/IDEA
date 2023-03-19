package com.xuyj.platform.common.entity;

import lombok.Data;

import java.io.Serializable;
@Data

public class ResultMessage<T> implements Serializable {
    private int code;
    private String message;
    private T data;

    public ResultMessage toSuccess(T data){
        code = ResultCode.SUCCESS.getCode();
        this.data = data;
        return this;
    }
}
