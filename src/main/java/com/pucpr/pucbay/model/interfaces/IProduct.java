package com.pucpr.pucbay.model.interfaces;

import com.pucpr.pucbay.model.base_table.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduct extends JpaRepository<Product,Integer> { }
