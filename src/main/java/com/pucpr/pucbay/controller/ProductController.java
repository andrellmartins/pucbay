package com.pucpr.pucbay.controller;

import com.pucpr.pucbay.model.base_table.Product;
import com.pucpr.pucbay.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/")
    public List<Product> getAll(){
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getId(@PathVariable("id") int id){
        return new Product();
    }

    @PostMapping("/insert")
    public Product insert(Product product){
        return productRepository.save(product);
    }


}
