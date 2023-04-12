package com.xuyj.platform.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName sys_log_entity
 */
@TableName(value ="sys_log_entity")
@Data
public class SysLogEntity implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 
     */
    private String className;

    /**
     * 
     */
    private String createDate;

    /**
     * 
     */
    private Long exeuTime;

    /**
     * 
     */
    private String methodName;

    /**
     * 
     */
    private String params;

    /**
     * 
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}