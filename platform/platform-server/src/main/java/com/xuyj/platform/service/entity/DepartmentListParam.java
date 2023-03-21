package com.xuyj.platform.service.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class DepartmentListParam extends PageBaseParam implements Serializable {
    @ApiModelProperty("部门名称")
    String Name;

}