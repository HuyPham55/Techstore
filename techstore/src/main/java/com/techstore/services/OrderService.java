/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.services;

import com.techstore.repositories.OrderRepository;
import com.techstore.techstore.entities.OrderEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<OrderEntity> all() {
        return repository.findAll();
    }

    public void save(OrderEntity entity) {
        repository.save(entity);
    }

    public OrderEntity get(Long id) {
        return repository.findById(id).get();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
