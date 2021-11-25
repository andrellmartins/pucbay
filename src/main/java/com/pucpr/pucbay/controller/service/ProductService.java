package com.pucpr.pucbay.controller.service;


import com.pucpr.pucbay.model.objects.ProductSimplified;
import com.pucpr.pucbay.model.tables.Product;
import com.pucpr.pucbay.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;


@Service
public class ProductService
        implements CrudInterface<Product> {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> save(Product entity) {
        return Optional.of(productRepository.save(entity));
    }

    @Override
    public Optional<Product> findById(long id) {
        return Optional.of(productRepository.findById(id));
    }

    @Override
    public void delete(Product entity) {
        productRepository.delete(entity);
    }

    @Override
    public void deleteById(long id) {
        productRepository.deleteById(id);
    }

    @Override
    public long count() {
        return productRepository.count();
    }

    public List<ProductSimplified> getTitleQuantity() {
        return productRepository.getTitleQuantity();
    }

}