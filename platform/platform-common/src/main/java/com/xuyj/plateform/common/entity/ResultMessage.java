package com.xuyj.plateform.common.entity;

import lombok.Data;

import java.io.Serializable;
@Data

public class ResultMessage<T> implements Serializable {
    private int code;
    private String message;
    private T data;
}
