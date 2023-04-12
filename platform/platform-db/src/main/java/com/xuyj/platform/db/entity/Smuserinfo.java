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
 * @TableName smUserInfo
 */
@TableName(value ="smUserInfo")
@Data
public class Smuserinfo implements Serializable {
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
     * 登录号
     */
    private String loginid;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 单位ID
     */
    private String unitid;

    /**
     * 是否允许同时登录
     */
    private Integer allowrepeatin;

    /**
     * 允许错误次数
     */
    private Integer errornumlock;

    /**
     * 指定工作日登录
     */
    private Integer week;

    /**
     * 登录次数
     */
    private Integer loginnum;

    /**
     * 最后登录 IP
     */
    private String lastip;

    /**
     * 最后登录时间
     */
    private Date lasttime;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 登录限制
     */
    private Integer inlimit;

    /**
     * 模块
     */
    private Integer module;

    /**
     * 备注
     */
    private String note;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 预售天数
     */
    private Integer presellday;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 微信ID
     */
    private String wxid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}