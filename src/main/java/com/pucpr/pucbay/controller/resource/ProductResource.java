package com.pucpr.pucbay.controller.resource;


import com.pucpr.pucbay.controller.service.ProductService;
import com.pucpr.pucbay.model.objetcs.ProductSimplified;
import com.pucpr.pucbay.model.tables.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductResource {

    @Autowired
    private ProductService productService;


    @GetMapping(value = "/list")
    public List<ProductSimplified> getProductList() {
        return productService.getTitleQuantity();
    }

    @GetMapping(value = "/")
    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Product> save(
            @RequestBody Product product) {
        productService.save(product) ;
        return ResponseEntity.ok().body(product);
    }

    @PutMapping("/")
    public ResponseEntity<Product> update(
            @RequestBody Product product) {

        productService.save(product);

        return ResponseEntity.ok().body(product);
    }

    @DeleteMapping("/")
    public ResponseEntity<String> delete(
            @RequestBody Product product) {

        productService.delete(product);
        return ResponseEntity.ok().body("Product excluded " + product.getId());
    }


}