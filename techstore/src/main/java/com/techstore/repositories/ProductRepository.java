/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.repositories;

import com.techstore.techstore.entities.ProductEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Administrator
 */
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    @Query("select product from ProductEntity product where product.name like %:search%")
    //@Query(value= "select * from products where name like %:search%", nativeQuery=true)
    public List<ProductEntity> findByString(@Param("search") String search);
}
