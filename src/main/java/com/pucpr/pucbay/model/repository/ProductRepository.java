package com.pucpr.pucbay.model.repository;

import com.pucpr.pucbay.model.objects.ProductSimplified;
import com.pucpr.pucbay.model.tables.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;


@Repository
public interface ProductRepository
        extends JpaRepository<Product, Long> {


    public Product findById(long id);

    @Query("SELECT new com.pucpr.pucbay.model.objects.ProductSimplified(p.title, p.available_quantity) FROM Product p")
    public List<ProductSimplified> getTitleQuantity();

    public List<Product> findAll();

    public Product deleteById(long id);


}


