package com.xuyj.springboot.controller;

import com.xuyj.springboot.config.TodoConfig;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController
@Api(tags = "A测试接口")
@Controller
@ResponseBody
public class HelloController {
    @Autowired
    private TodoConfig todoConfig;
    @Value("${todo.date}")
    String date;
    @GetMapping("hello")
    //@RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return todoConfig.getThing();
    }
    @GetMapping("/go")
    public String say2(){
        return "redirect:http://www.baidu.com";
    }
    @RequestMapping(value={"/welcome","/hi"},method = RequestMethod.GET)
    public String welcome(){
        return "index";
    }

    @GetMapping("/say")
    public String say3(@RequestParam("id") String id){
        return "RequestParam学生的ID是："+id;
    }
    @GetMapping("/say/{id}")
    public String say4(@PathVariable("id") String id){
        return "PathVariable:学生的ID是："+id;
    }

    @GetMapping("/say5")
    public String say5(@RequestParam( value = "id",required = false,defaultValue = "888") String id){
        return "RequestParam:学生的ID是："+id;
    }
}
