package com.atguigu.cache.service;

import com.atguigu.cache.bean.Employee;
import com.atguigu.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    /**
     * 将方法的运行结果进行缓存。
     * cacheManage管理多个Cache组件。
     *几个属性
     *  1.CacheName/value：指定缓存的组件的名字。
     *  2.Key.缓存数据使用key.默认使用参数值：
     *      编写spel: #id，参数id的值， #a0 #p0 #root.args[0]
     *  3.KeyGenerator: key的生成器，可以指定key的生成器的组件id.
     *          KeyGenerator 与key二选一。
     *    cacheManage 指定缓存管理器 CacheResolver 指定获取解析器。
     *    condition:指定符合条件的情况下缓存。
     *    unless: 否定缓存，条件为true时不缓存。
     *          可以获取到结果进行判断 ##result==null
     *    async：异步。
     *
     *
     * @param id
     * @return
     */
    @Cacheable(cacheNames = {"emp","temp"})
    public Employee getEmp(Integer id) {
        System.out.println("查询" + id + "号");
        return employeeMapper.getEmpById(id);
    }
}
