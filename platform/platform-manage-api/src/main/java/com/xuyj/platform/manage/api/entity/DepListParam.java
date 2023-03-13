package com.xuyj.platform.manage.api.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class DepListParam extends PageRequest implements Serializable {
    @ApiModelProperty("部门名称")
    private String depName;
}
