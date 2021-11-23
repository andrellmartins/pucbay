package com.pucpr.pucbay.controller.resource;


import com.pucpr.pucbay.controller.service.ProductService;
import com.pucpr.pucbay.model.tables.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductResource {

    @Autowired
    private ProductService productService;


    @GetMapping(value = "/product")
    public List<Product> getProductList() {
        return productService.findAll();
    }

    @PostMapping("/product")
    public ResponseEntity<Product> save(
            @RequestBody Product product) {
        productService.save(product) ;
        return ResponseEntity.ok().body(product);
    }

    @PutMapping("/product")
    public ResponseEntity<Product> update(
            @RequestBody Product product) {

        productService.save(product);

        return ResponseEntity.ok().body(product);
    }

    @DeleteMapping("/product")
    public ResponseEntity<String> delete(
            @RequestBody Product product) {

        productService.delete(product);
        return ResponseEntity.ok().body("Product excluded " + product.getId());
    }


}