package com.xuyj.platform.db.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName department
 */
@Data
public class Department implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String departmentname;

    private static final long serialVersionUID = 1L;
}