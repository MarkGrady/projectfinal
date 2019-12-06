package com.qf.projectfinal.service;

import com.qf.projectfinal.po.Product;

import java.util.List;

public interface ProductService {

    //查询所有基金
    public List<Product> findAll();

    //根据id查询基金
    public Product findProductById(int productId);
}
