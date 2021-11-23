package com.pucpr.pucbay.model.interfaces;

import com.pucpr.pucbay.model.base_table.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface CrudInterface<T>  {

    List<T> findAll();
    Optional<T> save(T entity);
    Optional<T> findById(long id);
    void delete(T entity);
    void deleteById(long id);
    long count();

}
