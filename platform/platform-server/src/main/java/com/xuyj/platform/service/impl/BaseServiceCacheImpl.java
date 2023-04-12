package com.xuyj.platform.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xuyj.platform.aspect.SysLog;
import com.xuyj.platform.db.entity.BaseEntity;
import com.xuyj.platform.service.BaseServiceCache;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import java.util.Collection;
import java.util.List;

@CacheConfig(cacheNames="baseCache") //抽取缓存的公共配置
public class BaseServiceCacheImpl<T extends BaseEntity, M extends BaseMapper<T>> extends ServiceImpl<M, T>
        implements BaseServiceCache<T> {
    @Override
    @Cacheable(keyGenerator = "myKeyGenerator")

    public List<T> listByCache() {
        return this.lambdaQuery().list();
    }

    @Override
    @SysLog()
    @CacheEvict(keyGenerator = "myKeyGenerator", beforeInvocation = true)
    public boolean insertByCache(T dto) {
        return this.save(dto);
    }

    @Override
    @SysLog()
    @CacheEvict(keyGenerator = "myKeyGenerator", beforeInvocation = true)
    public boolean updateByCache(T dto) {
        return this.updateById(dto);
    }

    @Override
    @SysLog()
    @CacheEvict(keyGenerator = "myKeyGenerator", beforeInvocation = true)
    public boolean deleteByCache(Collection<?> list) {
        return this.removeByIds(list);
    }


}

