package com.pucpr.pucbay.model.repository;

import com.pucpr.pucbay.model.base_table.Product;
import com.pucpr.pucbay.model.interfaces.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
@Component
public class ProductRepository{
    @Autowired
    private IProduct repository;

    public ProductRepository(){}

    public List<Product> findAll(){
        return repository.findAll();
    }
    public Product save(Product product){
        return repository.save(product);
    }
}
