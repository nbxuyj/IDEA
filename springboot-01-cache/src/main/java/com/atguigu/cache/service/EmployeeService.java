package com.atguigu.cache.service;

import com.atguigu.cache.bean.Employee;
import com.atguigu.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;
//此处写了cacheNames则方法前的value不需要再写
@CacheConfig(cacheNames="emp") //抽取缓存的公共配置
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    /**
     * 将方法的运行结果进行缓存。
     * cacheManage管理多个Cache组件。
     * 几个属性
     * 1.CacheName/value：指定缓存的组件的名字。
     * 2.Key.缓存数据使用key.默认使用参数值：
     * 编写spel: #id，参数id的值， #a0 #p0 #root.args[0]
     * 3.KeyGenerator: key的生成器，可以指定key的生成器的组件id.
     * KeyGenerator 与key二选一。
     * cacheManage 指定缓存管理器 CacheResolver 指定获取解析器。
     * condition:指定符合条件的情况下缓存。
     * unless: 否定缓存，条件为true时不缓存。
     * 可以获取到结果进行判断 ##result==null
     * aync：异步下condition条件不生效。
     * <p>
     * 原理：
     * 1.查找CacheAuto
     * 导入@Import({ CacheConfigurationImportSelector.class
     * 2.缓存的配置类：
     * org.springframework.boot.autoconfigure.cache.GenericCacheConfiguration
     * org.springframework.boot.autoconfigure.cache.JCacheCacheConfiguration
     * org.springframework.boot.autoconfigure.cache.EhCacheCacheConfiguration
     * org.springframework.boot.autoconfigure.cache.HazelcastCacheConfiguration
     * org.springframework.boot.autoconfigure.cache.InfinispanCacheConfiguration
     * org.springframework.boot.autoconfigure.cache.CouchbaseCacheConfiguration
     * org.springframework.boot.autoconfigure.cache.RedisCacheConfiguration
     * org.springframework.boot.autoconfigure.cache.Cache2kCacheConfiguration
     * org.springframework.boot.autoconfigure.cache.CaffeineCacheConfiguration
     * org.springframework.boot.autoconfigure.cache.SimpleCacheConfiguration
     * org.springframework.boot.autoconfigure.cache.NoOpCacheConfiguration
     * 3. 配置中开启debug=true 控制台会显示报告。
     * SimpleCacheConfiguration matched
     * 注册了一个ConcurrentMapCacheManager
     * 可以获取或创建ConcurrentMapCache类型的缓存组件，他的作用将数据保存在ConcurrentMap中。
     * 运行流程：
     * 1.方法运行之前，先去查询cache（缓存组件），按照cachenames指定的名称获取
     * 2.
     * <p>
     * <p>
     * 核心：
     * 1）使用cacheManager按照名字得到cacher组件.
     * 2）key是使用keyGerater生成。
     * <p>
     * 断点：
     * <p>
     * 1. ConcurrentMapCacheManager.getCache
     * 2. CacheAspectSupport.findCachedItem 中的generateKey
     * 3. ConcurrentMapCache.lookup
     * 4.ConcurrentMapCache.put
     * <p>
     * 需求：
     * 1.key显示 getEmp[2]
     * 2.使用生成器来生成。
     *
     * @param id
     * @return
     */
    //@Cacheable(cacheNames = {"emp"},key="#root.methodNa


    //condition = "#a0>1
 @Cacheable(cacheNames = {"emp"},keyGenerator = "myKeyGenerator")
    //@Cacheable()
    public Employee getEmp(Integer id) {
        System.out.println("查询" + id + "号");
        return employeeMapper.getEmpById(id);

    }


    /**
     * @CachePut即调用方法，又更新缓存数据 * 先调用目标方法，将结果缓存起来。
     * 测试步骤：
     * 1.查询1号员工。
     * 2.再更新员工。
     * <p>
     * key:#employee.id
     * 还可以。
     */

    @CachePut(value = "emp", key = "#result.id")
    public Employee updateEmp(Employee employee) {
        System.out.println("员工更新。");
        employeeMapper.updateEmp(employee);
        return employee;
    }

    /**
     * allEntri
     *
     * @param id key = "#id"
     *           beforeInvocation 表示在方法执行之前清理缓存。
     */
    @CacheEvict(value = "emp", allEntries = true, beforeInvocation = true)

    public void deleteEmp(Integer id) {
        System.out.println("deleteEmp:" + id);
        Integer a = 10 / 0;
    }

    //@Caching 定义复杂的缓存规则，给类上增加@CacheConfig()
    @Caching(
            cacheable = {
                    @Cacheable(value = "emp", key = "#lastName")
            },
            put = {
                    @CachePut(value = "emp", key = "#result.id"),
                    @CachePut(value = "emp", key = "#result.email"),
            }

    )
    public Employee getEmpByLastName(String lastName) {
        return employeeMapper.getEmpByLastName(lastName);
    }

}