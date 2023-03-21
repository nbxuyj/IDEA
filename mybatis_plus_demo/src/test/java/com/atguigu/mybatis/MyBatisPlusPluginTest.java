package com.atguigu.mybatis;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.atguigu.mybatis.mapper.ProductMapper;
import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.Product;
import com.atguigu.mybatis.pojo.User;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisPlusPluginTest {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void testPage() {
        Page<User> page = new Page<>(2, 3);
        userMapper.selectPage(page, null);
        System.out.println(page);
    }

    @Test
    public void testPage2() {
        Page<User> page = new Page<>(2, 3);
        userMapper.selectPage(page, null);
        System.out.println(page.getRecords());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
    }

    @Test
    public void testPageVo() {
        Page<User> page = new Page<>(1, 3);
        userMapper.selectPageVo(page, 20);
        System.out.println(page.getRecords());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
    }

    //测试乐观锁
    @Test
    public void testProduct01() {
        //小李查询商品价格。
        Product productLi = productMapper.selectById(1);
        System.out.println("小李查询到商品的价格:" + productLi.getPrice());

        //小李查询商品价格。
        Product productWang = productMapper.selectById(1);
        System.out.println("小王查询到商品的价格:" + productWang.getPrice());
        //小李将商品价格+50
        productLi.setPrice(productLi.getPrice() + 50);
        productMapper.updateById(productLi);

        //小王将商品价格-30
        productWang.setPrice(productWang.getPrice() - 30);
        int result = productMapper.updateById(productWang);
        if (result == 0) {
            Product productNew = productMapper.selectById(1);
            productNew.setPrice(productNew.getPrice() - 30);
            productMapper.updateById(productNew);
        }


        //老板查询商品价格。
        Product productLaoban = productMapper.selectById(1);
        System.out.println("老板查询的价格:" + productLaoban.getPrice());

    }
}
