package com.xuyj.platform.db.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 * @TableName employee
 */
@Data
public class Employee implements Serializable {
    /**
     * 
     */
    @ApiModelProperty("用户ID")
    private Integer id;

    /**
     * 
     */
    @ApiModelProperty("用户姓名")
    private String lastname;

    /**
     * 
     */
    @ApiModelProperty("用户邮箱")
    private String email;

    /**
     * 
     */
    @ApiModelProperty("用户性别")
    private Integer gender;

    /**
     * 
     */
    @ApiModelProperty("部门ID")
    private Integer dId;

    private static final long serialVersionUID = 1L;
}