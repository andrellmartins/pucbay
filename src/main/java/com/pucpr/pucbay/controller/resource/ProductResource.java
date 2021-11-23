package com.pucpr.pucbay.controller.resource;

import com.pucpr.pucbay.model.base_table.Product;
import com.pucpr.pucbay.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductResource {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/product")
    public List<Product> getAll(){
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public Product getId(@PathVariable("id") int id){
        return new Product();
    }

    @PostMapping("/product/insert")
    public Product insert(Product product){
        return productRepository.save(product);
    }


}
