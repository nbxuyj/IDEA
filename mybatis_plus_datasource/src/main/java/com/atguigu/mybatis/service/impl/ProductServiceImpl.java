package com.atguigu.mybatis.service.impl;

import com.atguigu.mybatis.entity.Product;
import com.atguigu.mybatis.mapper.ProductMapper;
import com.atguigu.mybatis.service.IProductService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author atguigu
 * @since 2023-03-02
 */
@DS("slave_1")
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
