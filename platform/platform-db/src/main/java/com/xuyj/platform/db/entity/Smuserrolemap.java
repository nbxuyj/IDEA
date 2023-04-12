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
 * @TableName smUserRoleMap
 */
@TableName(value ="smUserRoleMap")
@Data
public class Smuserrolemap implements Serializable {
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
     * 角色ID
     */
    private String roleid;

    /**
     * 帐号ID
     */
    private String userid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}