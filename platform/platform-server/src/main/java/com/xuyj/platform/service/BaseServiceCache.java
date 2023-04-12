package com.xuyj.platform.service;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Collection;
import java.util.List;

public interface BaseServiceCache<T>  extends IService<T> {
    List<T> listByCache();
    boolean insertByCache(T dto);
    boolean updateByCache(T dto);
    boolean deleteByCache(Collection<?> list);

}
