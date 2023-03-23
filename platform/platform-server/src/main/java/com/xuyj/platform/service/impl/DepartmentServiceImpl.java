package com.xuyj.platform.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bestvike.linq.Linq;
import com.mysql.cj.util.StringUtils;
import com.xuyj.platform.common.utils.ListPageUtil;
import com.xuyj.platform.db.entity.Department;
import com.xuyj.platform.db.mapper.DepartmentMapper;
import com.xuyj.platform.service.DepartmentService;
import com.xuyj.platform.service.entity.DepartmentListParam;
import com.xuyj.platform.service.entity.PageResult;
import lombok.var;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author openx
 * @description 针对表【department】的数据库操作Service实现
 * @createDate 2023-03-13 16:09:05
 */
@Service
@CacheConfig(cacheNames = "dep")
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
        implements DepartmentService {
    public PageResult<Department> mySelectAll(DepartmentListParam param) {
//       //1.采用LambdaQueryWrapper构建查询条件。
//       LambdaQueryWrapper<Department> mp = new LambdaQueryWrapper<>();
//       //按客户名称、客户电话模糊查询
//       mp.like(param != null && !StringUtils.isNullOrEmpty(param.getName()), Department::getDepartmentname, param.getName());
//
//
//       //构建分页查询条件。
//       PageResult<Department> page = new PageResult<>(param.getPageNumber(), param.getPageSize());
//       return this.getBaseMapper().selectPage(page, mp);

        //调用缓存查询。

        List<Department> departments = GetCacheAll();
        //拼接条件(参考：https://www.cnblogs.com/shadoll/p/14292909.html)。
        var ddd = Linq.of(departments).where(x -> StringUtils.isNullOrEmpty(param.getName()) && x.getDepartmentname().contains(param.getName()));
         ddd = Linq.of(ddd).where(x -> StringUtils.isNullOrEmpty(param.getTel()) && x.getTel().contains(param.getTel()));
         var list=ddd.toList();

         var pageList=new ListPageUtil<>(list, param.getPageNumber(), param.getPageSize());
        PageResult<Department> page =  new PageResult<Department>(param.getPageNumber(), param.getPageSize());
         page.setRecords(pageList.getData());
         return  page;

    }

    @Cacheable()
    public List<Department> GetCacheAll() {
        return this.getBaseMapper().selectList(null);
    }

    @Override
    @Cacheable()
    public Department getDep(Integer id) {
        System.out.println("查询" + id + "部门");
        return this.getBaseMapper().selectById(id);
    }
}




