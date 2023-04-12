package com.xuyj.platform.service;

import com.xuyj.platform.service.entity.KeyValue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SysparamServiceTest {
    @Resource
    SysparamService service;
    @Test
    public  void SaveVBarnd(){
        List<KeyValue> kvs=new ArrayList<>() ;
        kvs.add(new KeyValue("0","本田"));
        kvs.add(new KeyValue("1","奥迪"));
        kvs.add(new KeyValue("2","宝马"));
        service.SaveVehicleBrands(kvs);
    }
}