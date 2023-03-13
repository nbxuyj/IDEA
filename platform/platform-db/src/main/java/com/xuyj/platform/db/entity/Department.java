package com.xuyj.platform.db.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

/**
 * @TableName department
 */
@Data
public class Department implements Serializable {
    /**
     *
     */
    @ApiModelProperty("部门ID")
    private Integer id;

    /**
     *
     */
    @ApiModelProperty("部门名称")
    private String departmentname;

    private static final long serialVersionUID = 1L;
}