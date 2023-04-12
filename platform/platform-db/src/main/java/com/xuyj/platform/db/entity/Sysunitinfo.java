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
 * @TableName sysUnitInfo
 */
@TableName(value ="sysUnitInfo")
@Data
public class Sysunitinfo implements Serializable {
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
     * 单位代码
     */
    private String unitcode;

    /**
     * 单位名字
     */
    private String unitname;

    /**
     * 单位全称
     */
    private String unitfullname;

    /**
     * 联系方式
     */
    private String telnet;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 截止有效日期
     */
    private Date activedate;

    /**
     * 是否启用
     */
    private Integer enabled;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}