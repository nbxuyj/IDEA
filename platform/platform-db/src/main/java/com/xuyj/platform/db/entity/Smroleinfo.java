package com.xuyj.platform.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName smRoleInfo
 */
@TableName(value ="smRoleInfo")
@Data
public class Smroleinfo implements Serializable {
    /**
     * 
     */
    @TableId
    private String guid;

    /**
     * 
     */
    private Date modifytime;

    /**
     * 
     */
    private Integer rowversion;

    /**
     * 
     */
    private Integer rowflag;

    /**
     * 单位guid
     */
    private String unitid;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 备注
     */
    private String note;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}