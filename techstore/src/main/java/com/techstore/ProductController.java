/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore;

import com.techstore.services.ProductService;
import com.techstore.techstore.entities.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Administrator
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/product/{id}")
    public String showProductById(@PathVariable(name = "id") Long id, Model model) {
        ProductEntity product = productService.get(id);
        //Debug
        //System.out.println("The category browsing is: "+product.getCategory().getName());
        model.addAttribute("product", product);
        return "product";
    }
}
