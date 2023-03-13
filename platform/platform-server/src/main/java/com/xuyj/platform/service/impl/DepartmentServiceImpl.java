package com.xuyj.platform.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mysql.cj.util.StringUtils;
import com.xuyj.platform.db.entity.Department;
import com.xuyj.platform.db.mapper.DepartmentMapper;
import com.xuyj.platform.service.DepartmentService;
import org.springframework.stereotype.Service;

/**
* @author openx
* @description 针对表【department】的数据库操作Service实现
* @createDate 2023-03-13 16:09:05
*/
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements DepartmentService {
   public Page<Department> mySelectAll(Page<Department> page, Department dep){
       String depName="";
       if (dep!=null && StringUtils.isNullOrEmpty(dep.getDepartmentname())){
           depName=dep.getDepartmentname();
       }
       LambdaQueryWrapper<Department> mp=new LambdaQueryWrapper<>();
       mp.like(StringUtils.isNullOrEmpty(depName),Department::getDepartmentname,depName);
      return this.getBaseMapper().selectPage(page,mp);

   }
}




