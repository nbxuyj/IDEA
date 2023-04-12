package com.xuyj.platform.service.entityDTO.response.Sysparam;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.xuyj.platform.db.entity.Sysparam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;

/**
 * (Sysparam)表实体类
 *
 * @author makejava
 * @since 2023-04-12 09:19:53
 */
@Data
@ApiModel("SysparamDto")
@JsonIgnoreProperties(value = {"modifytime", "rowversion",
        "rowflag"})
public class SysparamDto extends Sysparam implements Serializable {
}

