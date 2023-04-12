package com.xuyj.platform.service.entityDTO.request.Sysparam;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;

/**
 * (Sysparam)表实体类
 *
 * @author makejava
 * @since 2023-04-12 09:19:26
 */
@Data
@ApiModel("SysparamEditDto")
public class SysparamEditDto extends SysparamAddDto implements Serializable {
    @ApiModelProperty("主键guid")
    private String guid;
}

