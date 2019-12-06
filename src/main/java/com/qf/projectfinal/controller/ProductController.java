package com.qf.projectfinal.controller;


import com.qf.projectfinal.po.Product;
import com.qf.projectfinal.service.ProductService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
//    log4j日志
    private static final Logger logger= LogManager.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    //查询所有基金
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<Product> findAll(){
        List<Product> all = productService.findAll();
        return all;
    }

    //通过id查询对应的基金
    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    public Product findProductById(@RequestParam("productId") int productId){
        Product productById = productService.findProductById(productId);
        logger.info(productId+"=====");
        if (productById!=null){
            return productById;
        }
        return null;
    }
}
