package com.xuyj.platform.service.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PageRequest {
     @ApiModelProperty("页码")
     int  pageNumber ;
     @ApiModelProperty("每页显示记录数")
     int pageSize;
}
