#2023.01.06
swagger启动
参考：
http://localhost:8080/swagger-ui.html#/
步骤：
1.引用依赖
        <!--Swagger2依赖-->
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
            <version>2.9.2</version>
        </dependency>

        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>2.9.2</version>
        </dependency>
        
2.创建配置类
config/SwaggerConfig
3.编写实体类。
    这一步是在bean层，或者说DAO、Domain，Entity，叫法不同，实际指的就是实体类。
    @ApiModel用于实体类上，value表示对象名，description表示对象描述。

4.编写Controller类。
    @Api 表示这个类是swagger的资源，value和tags都是接口说明
    @ApiOperation 用于方法上，value表示接口描述，notes表示提示内容
    @ApiParam用于参数上，name表示参数名，notes表示参数说明，required表示表示是否必填，值为true或false

