package com.xuyj.controller;

import com.xuyj.controller.bean.Dog;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
@Api(value = "HelloParamBean控制器说明", tags = "对象传参示例")
@Controller
public class HelloParamBean {
    @ResponseBody
    @PostMapping("helloBean")
    public Map<String, Object> helloBean(@RequestBody Dog dog) {
        Map<String, Object> result = new HashMap<>();
        result.put("dog", dog);
        return result;
    }
}
