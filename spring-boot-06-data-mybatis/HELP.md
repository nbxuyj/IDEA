# 2023.02.23
    问题1：
    1.IP地址写错。
1.可以访问：http://localhost:8085/druid/login.html
2.创建自动执行脚本的方法。
https://www.163.com/dy/article/GB0GHHP30511FQO9.html
sql:
  init:
    mode: always
在resources目录下创建脚本schema-all.sql

问题1： 执行插入报错。
格式写错。
http://localhost:8085/dept?departmentName=ddd



## 执行
1.注解版本。
    查询：http://localhost:8085/dept/1
    插入：http://localhost:8085/dept?departmentName=zs
2.配置版本： 完工。
    http://localhost:8085/emp/1


步骤：
1). 创建Mapper接口。
2).创建Mapper的XML文件。
3）在yml中配置全局文件的位置。
注：
1）配置Mapper命名空间要指定到Mapper。 namespace="com.atguigu.springboot.mapper.EmployeeMapper
2）id就是方法名。
3）演示时did无值，由于驼峰命名问题写配置。


## 2023.02.25


