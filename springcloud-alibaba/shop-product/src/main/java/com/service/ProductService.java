package com.service;

import com.Product;

public interface ProductService {


    //根据pid查询商品信息
    Product findByPid(Integer pid);
}
