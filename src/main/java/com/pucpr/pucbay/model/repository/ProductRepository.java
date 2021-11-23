package com.pucpr.pucbay.model.repository;

import com.pucpr.pucbay.model.tables.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ProductRepository
        extends JpaRepository<Product, Long> {


    public List<Product> findProductByTitle(String title);

    @Query("select p from Product p where p.id in (:lista)")
    public List<Product> findById();

    @Query("SELECT p.title, p.available_quantity FROM Product p")
    public List<Product> findAll();

    /*//ESTAS MERDAS NÃO FUNCIONAM!!!!!!! NAO SEI OQ FAZER ...
    @Modifying
    @Query(value = "insert into Product p values (p.bd_id, p.id, p.title, p.site_id p.id_integracao, p.subtitle, p.seller_id, p.price, p.base_price, p.original_price, p.initial_quantity\n" +
            "p.available_quantity, p.currency_id, p.start_time, p.stop_time, p.condition, p.permalink", nativeQuery = true)
    public void save(Product p);
    */

    @Modifying
    @Query(value = "delete p from Product p where p.id = :id", nativeQuery = true)
    public void delete(Long id);

    @Modifying
    @Query("update Product p set p.title = ?1, p.seller_id = ?3 where p.id = ?2")
    public int update(String title, Long id, String seller);


}


