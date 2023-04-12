package com.xuyj.platform.service.entityDTO.request.Sysparam;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;

/**
 * (Sysparam)表实体类
 *
 * @author makejava
 * @since 2023-04-12 09:19:24
 */
@Data
@ApiModel("SysparamAddDto")
public class SysparamAddDto implements Serializable {
    //从DB对象中手动复制需要增加的实体字段
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

