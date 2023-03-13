package com.xuyj.platform.db.entity;

import java.io.Serializable;
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
    private Integer id;

    /**
     * 
     */
    private String lastname;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private Integer gender;

    /**
     * 
     */
    private Integer dId;

    private static final long serialVersionUID = 1L;
}