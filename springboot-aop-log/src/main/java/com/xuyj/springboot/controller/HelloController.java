package com.xuyj.springboot.controller;

import com.xuyj.springboot.config.TodoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController
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
    @RequestMapping({"/welcome","/hi"})
    public String welcome(){
        return "index";
    }


}
