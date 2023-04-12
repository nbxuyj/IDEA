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
 * @TableName smRolePermMap
 */
@TableName(value ="smRolePermMap")
@Data
public class Smrolepermmap implements Serializable {
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
     * 关联的角色
     */
    private String roleid;

    /**
     * 关联的权限
     */
    private String permid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}