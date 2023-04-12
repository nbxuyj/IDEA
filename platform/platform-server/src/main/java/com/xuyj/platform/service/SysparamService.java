package com.xuyj.platform.service;

import com.xuyj.platform.db.entity.Sysparam;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xuyj.platform.service.entity.KeyValue;

import java.util.List;

/**
* @author openx
* @description 针对表【sysParam】的数据库操作Service
* @createDate 2023-04-12 09:04:30
*/
public interface SysparamService extends IService<Sysparam> {
    List<KeyValue> getVehicleBrands();

    Integer SaveVehicleBrands(List<KeyValue> types);
}
