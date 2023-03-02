
# 2023.02.26
参考：https://www.bilibili.com/video/BV12R4y157Be?p=6&spm_id_from=pageDriver
https://www.bilibili.com/video/BV12R4y157Be?p=10&spm_id_from=pageDriver
问题。

https://www.bilibili.com/video/BV12R4y157Be?p=14&spm_id_from=pageDriver 
14-测试BaseMapper的删除功能
进行中

2023年2月27日 21:09:07
https://www.gulixueyuan.com/course/516/task/22786/show





问题：
    2023年2月27日, PM 05:16:25 
    @TableId(value = "uid",type = IdType.AUTO) 设置与不设置均有默认值？
    答复：由于mysql中设置了自增。且要求截断，否则有记忆，导致误解。
    
小结：
1.设置@TableId 会默认采用雪花算法。
2.设定自增，先将表字段设置为自增。测试还是雪花算法，将type调整为
3.单独设置ID，优先级高。
4.可设置统一的生成策略。
5.有逻辑删除时，查询也不需要指定is_deleted.
   
https://www.gulixueyuan.com/course/516/task/22801/show

悲观锁：
1.当一个人操作，其它和等待。
乐观锁：
1.有行版本号，查询数据及对应的版本号。


添加枚举备注：
1.枚举值增加@EnumValue.
2.增加配置。 type-enums-package: com.atguigu.mybatis.enums
    
代码生成器使用步骤：
1.添加两个依赖。

  https://www.gulixueyuan.com/course/516/task/22818/show