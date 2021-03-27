/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.services;

import com.techstore.repositories.CustomerRepository;
import com.techstore.techstore.entities.CustomerEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class CustomerService {

    //Repository auto injection with @Autowired annotation
    @Autowired
    private CustomerRepository repository;

    public List<CustomerEntity> all() {
        return repository.findAll();
    }

    public void save(CustomerEntity entity) {
        repository.save(entity);
    }

    public CustomerEntity get(Long id) {
        return repository.findById(id).get();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
