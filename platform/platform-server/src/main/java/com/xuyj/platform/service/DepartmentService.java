package com.xuyj.platform.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xuyj.platform.db.entity.Department;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xuyj.platform.service.entity.DepartmentListParam;
import com.xuyj.platform.service.entity.PageResult;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author openx
* @description 针对表【department】的数据库操作Service
* @createDate 2023-03-13 15:40:44
*/
@Service
public interface DepartmentService extends IService<Department> {
//    PageResult<Department> mySelectAll(DepartmentListParam p);
//    Department getDep(Integer id);
List<Department> GetCacheAll();
}
