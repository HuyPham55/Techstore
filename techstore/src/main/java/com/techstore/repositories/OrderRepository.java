/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.repositories;

import com.techstore.techstore.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Administrator
 */
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

}
