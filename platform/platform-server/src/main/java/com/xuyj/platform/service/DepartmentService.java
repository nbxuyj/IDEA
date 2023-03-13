package com.xuyj.platform.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xuyj.platform.db.entity.Department;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
* @author openx
* @description 针对表【department】的数据库操作Service
* @createDate 2023-03-13 15:40:44
*/
@Service
public interface DepartmentService extends IService<Department> {
    Page<Department> mySelectAll( Page<Department> page,Department dep);
}
