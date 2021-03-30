/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore;

import com.techstore.services.CategoryService;
import com.techstore.services.ProductService;
import com.techstore.techstore.entities.CategoryEntity;
import com.techstore.techstore.entities.ProductEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Administrator
 */
@Controller
public class HomeController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/")
    public String homepage(Model model, @RequestParam(required = false) Long category, @RequestParam(required = false) String search) {
        List<ProductEntity> listProducts;
        if (null != category) {
            CategoryEntity categoryEntity = categoryService.get(category);
            model.addAttribute("listProducts", categoryEntity.getProducts());
            return "homepage";

        }

        if (null != search) {
            model.addAttribute("listProducts", productService.findByString(search));
            return "homepage";
        }
        model.addAttribute("listProducts", productService.all());
        return "homepage";
    }

    @RequestMapping("/thongtin")
    public String about() {
        return "about";
    }

}
