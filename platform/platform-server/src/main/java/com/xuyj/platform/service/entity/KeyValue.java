package com.xuyj.platform.service.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Api(tags = "keyValue实体")
@NoArgsConstructor
public class KeyValue implements Serializable {
    @ApiModelProperty("代码")
    String code;
    @ApiModelProperty("名称")
    String value;

    public KeyValue(String code, String value) {
        this.code = code;
        this.value = value;
    }
}
