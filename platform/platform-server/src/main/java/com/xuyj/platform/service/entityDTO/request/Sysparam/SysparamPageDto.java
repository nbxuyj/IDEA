package com.xuyj.platform.service.entityDTO.request.Sysparam;
import com.xuyj.platform.service.entity.PageBaseParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * (Sysparam)表实体类
 *
 * @author makejava
 * @since 2023-04-12 09:19:26
 */
@Data
@ApiModel("SysparamPageDto")
public class SysparamPageDto extends PageBaseParam implements Serializable {
    @ApiModelProperty("主键guid")
    private String guid;
}

