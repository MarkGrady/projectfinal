package com.qf.projectfinal.mapper;

import com.qf.projectfinal.po.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {

    //查询所有基金
    public List<Product> findAll();

    //根据id查询基金
    public Product findProductById(int productId);

}
