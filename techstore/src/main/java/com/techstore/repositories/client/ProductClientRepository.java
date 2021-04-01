/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.repositories.client;

import com.techstore.services.ProductService;
import com.techstore.techstore.apiobject.ProductClientObject;
import com.techstore.techstore.entities.ProductEntity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Repository  
public class ProductClientRepository {

    private List<ProductClientObject> productClientList = new ArrayList<ProductClientObject>();

    @Autowired
    private ProductService productService;

    public ProductClientRepository() {
    }

    public List<ProductClientObject> all() {
        return productClientList;
    }

    public ProductClientObject getById(int id) {
        return productClientList.get(id);
    }

    public void add(ProductClientObject productClientObject) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        productClientList.add(productClientObject);
    }
}
