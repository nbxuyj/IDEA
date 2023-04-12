package com.xuyj.platform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuyj.platform.cache.SysparamCache;
import com.xuyj.platform.common.utils.GsonUtils;
import com.xuyj.platform.db.entity.Sysparam;
import com.xuyj.platform.db.enums.SysParamEnum;
import com.xuyj.platform.service.SysparamService;
import com.xuyj.platform.db.mapper.SysparamMapper;
import com.xuyj.platform.service.entity.KeyValue;
import lombok.var;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
* @author openx
* @description 针对表【sysParam】的数据库操作Service实现
* @createDate 2023-04-12 09:04:30
*/
@Service
public class SysparamServiceImpl extends ServiceImpl<SysparamMapper, Sysparam>
    implements SysparamService{
    @Resource
    SysparamCache cache;

    /**
     * 获取车型
     *
     * @return
     */
    public List<KeyValue> getCarrytypes() {
        return getKeyValues(SysParamEnum.vehicleType);
    }

    /**
     * 获取车辆品牌
     *
     * @return
     */
    public List<KeyValue> getVehicleBrands() {
        return getKeyValues(SysParamEnum.vehicleBrand);
    }


    /**
     * 保存车型。
     *
     * @param types
     */
    public Integer SaveCarrytypes(List<KeyValue> types) {
        return SaveKeyValues(SysParamEnum.vehicleBrand, types);
    }

    /**
     * 保存车辆品牌
     *
     * @param types
     * @return
     */
    public Integer SaveVehicleBrands(List<KeyValue> types) {
        return SaveKeyValues(SysParamEnum.vehicleBrand, types);
    }

    /**
     * 获取通用KeyValue类型的参数。
     *
     * @param myEnum
     * @return
     */
    private List<KeyValue> getKeyValues(SysParamEnum myEnum) {
//        LambdaQueryWrapper<Sysparam> mp = new LambdaQueryWrapper<>();
//        mp.eq(true, Sysparam::getParamname, myEnum.toString());
//        Sysparam one = this.baseMapper.selectOne(mp);

        //采用缓存查询。
        Optional<Sysparam> first = cache.listByCache().stream().filter(p -> p.getParamname().equals(myEnum.toString())).findFirst();
        if (first == null || !first.isPresent()) return new ArrayList<>();
        KeyValue[] values = GsonUtils.fromJson(first.get().getParamvalue(), KeyValue[].class);
        return Arrays.asList(values);

    }

    /**
     * 保存通用KeyValue类型的参数。
     *
     * @param myEnum
     * @param types
     * @return
     */
    public Integer SaveKeyValues(SysParamEnum myEnum, List<KeyValue> types) {
        var json = GsonUtils.toJson(types);
        Sysparam p = new Sysparam();
        p.setParamname(myEnum.toString());
        p.setParamvalue(json);
        p.setUnitid("");
        p.setPramtype(0);
        return cache.insertByCache(p) ? 1 : 0;

    }
}




