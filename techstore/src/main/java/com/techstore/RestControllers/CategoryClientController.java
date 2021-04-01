/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.RestControllers;

import com.techstore.repositories.client.CategoryClientRepository;
import com.techstore.services.CategoryService;
import com.techstore.techstore.apiobject.CategoryClientObject;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/client")
public class CategoryClientController {

    @Autowired
    private CategoryClientRepository categoryClientRepository;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/getloaisp")
    public @ResponseBody
    List<CategoryClientObject> getSpAll() {
        if (categoryClientRepository.all().isEmpty()) {
            categoryService.all().forEach(productEntity -> {
                categoryClientRepository.add(new CategoryClientObject(productEntity));
            });
        }
        return categoryClientRepository.all();
    }
}
