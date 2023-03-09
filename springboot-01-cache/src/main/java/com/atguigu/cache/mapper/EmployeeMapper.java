package com.atguigu.cache.mapper;

import com.atguigu.cache.bean.Employee;
import org.apache.ibatis.annotations.*;




@Mapper
public interface EmployeeMapper {
    @Select("select * from employee where id=#{id}")
    Employee getEmpById(Integer id);

    @Update("upate employee set lastName=#{lastName},email=#{email},gender=#{gender}, dId={#dId} where id=#{id}")
     void updateEmp(Employee employee);

    @Delete("delete employee where id=#{id}")
    void deleteEmpById(Integer id);

    @Insert("insert into employee(lastName,email,gender,d_id) values(#{lastName},#{email},#{gender},#{d_id})")
    void insertEmployee(Employee employee);

}
