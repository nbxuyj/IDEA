package com.xuyj.platform.db.entity;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
* 
* @TableName sysParam
*/
@Data
public class Sysparam extends BaseEntity implements Serializable {


    /**
    * 单位ID
    */


    @ApiModelProperty("单位ID")
    private String unitid;
    /**
    * 参数名称
    */

    @ApiModelProperty("参数名称")
    private String paramname;
    /**
    * 参数值
    */

    @ApiModelProperty("参数值")
    private String paramvalue;
    /**
    * 
    */
    @ApiModelProperty("")
    private Integer pramtype;



}
