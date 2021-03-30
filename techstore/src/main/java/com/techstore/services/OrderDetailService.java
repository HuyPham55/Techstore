/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.services;

import com.techstore.repositories.OrderDetailRepository;
import com.techstore.techstore.entities.OrderDetail;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class OrderDetailService {

    @Autowired
    private OrderDetailRepository repository;

    public List<OrderDetail> all() {
        return repository.findAll();
    }

    public void save(OrderDetail entity) {
        repository.save(entity);
    }

    public OrderDetail get(Long id) {
        return (OrderDetail) repository.findById(id).get();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
