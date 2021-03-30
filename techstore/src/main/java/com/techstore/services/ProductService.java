/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.services;

import com.techstore.repositories.ProductRepository;
import com.techstore.techstore.entities.ProductEntity;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<ProductEntity> all() {
        return repository.findAll();
    }

    public void save(ProductEntity entity) {
        repository.save(entity);
    }

    public ProductEntity get(Long id) {
        return repository.findById(id).get();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<ProductEntity> findByForeignKey(Long category) {
        List<ProductEntity> productList = null;
        for (ProductEntity product : repository.findAll()) {
            if (Objects.equals(category, product.getCategory())) {
                productList.add(product);
            }
        }
        return productList;
    }
}
