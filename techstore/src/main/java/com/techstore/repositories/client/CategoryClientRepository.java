/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.repositories.client;

import com.techstore.techstore.apiobject.CategoryClientObject;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Repository
public class CategoryClientRepository {

    private List<CategoryClientObject> categoryClientList = new ArrayList<CategoryClientObject>();

    public List<CategoryClientObject> all() {
        return categoryClientList;
    }

    public CategoryClientObject getById(int id) {
        return categoryClientList.get(id);
    }

    public void add(CategoryClientObject categoryClientObject) {
        categoryClientList.add(categoryClientObject);
    }
}
