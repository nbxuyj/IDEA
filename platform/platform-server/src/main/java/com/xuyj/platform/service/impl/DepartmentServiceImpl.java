package com.xuyj.platform.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mysql.cj.util.StringUtils;
import com.xuyj.platform.db.entity.Department;
import com.xuyj.platform.db.mapper.DepartmentMapper;
import com.xuyj.platform.service.DepartmentService;
import com.xuyj.platform.service.entity.DepartmentListParam;
import com.xuyj.platform.service.entity.PageResult;
import org.springframework.stereotype.Service;

/**
* @author openx
* @description 针对表【department】的数据库操作Service实现
* @createDate 2023-03-13 16:09:05
*/
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements DepartmentService {
   public PageResult<Department> mySelectAll(DepartmentListParam param){
       //1.采用LambdaQueryWrapper构建查询条件。
       LambdaQueryWrapper<Department> mp = new LambdaQueryWrapper<>();
       //按客户名称、客户电话模糊查询
       mp.like(param != null && !StringUtils.isNullOrEmpty(param.getName()), Department::getDepartmentname, param.getName());


       //构建分页查询条件。
       PageResult<Department> page = new PageResult<>(param.getPageNumber(), param.getPageSize());
       return this.getBaseMapper().selectPage(page, mp);


   }
}




