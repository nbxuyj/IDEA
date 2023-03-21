package com.xuyj.platform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuyj.platform.db.entity.Employee;
import com.xuyj.platform.db.mapper.EmployeeMapper;
import com.xuyj.platform.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
* @author openx
* @description 针对表【employee】的数据库操作Service实现
* @createDate 2023-03-13 16:09:05
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService {

}




