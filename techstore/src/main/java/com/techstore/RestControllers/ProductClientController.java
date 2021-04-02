/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.RestControllers;

import com.techstore.repositories.client.ProductClientRepository;
import com.techstore.repositories.ProductRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techstore.services.ProductService;
import com.techstore.techstore.apiobject.ProductClientObject;
import com.techstore.techstore.entities.ProductEntity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/client")
public class ProductClientController {

    @Autowired
    private ProductClientRepository productClientRepository;

    @Autowired
    private ProductService productService;

    @GetMapping("/getspmoi")
    public @ResponseBody
    List<ProductClientObject> getSpMoi() {
        if (productClientRepository.all().isEmpty()) {
            productService.all().forEach(productEntity -> {
                productClientRepository.add(new ProductClientObject(productEntity));
            });
        }
        List<ProductClientObject> productClientList = new ArrayList<ProductClientObject>();
        for (int i = 0; i < 6; i++) {
            productClientList.add(productClientRepository.getById(i));
        }
        return productClientList;

    }

    @GetMapping("/getspall")
    public @ResponseBody
    List<ProductClientObject> getSpAll() {
        if (productClientRepository.all().isEmpty()) {
            productService.all().forEach(productEntity -> {
                productClientRepository.add(new ProductClientObject(productEntity));
            });
        }
        return productClientRepository.all();
    }

    @GetMapping("/getspbanchay")
    public @ResponseBody
    List<ProductClientObject> getSpBanChay() {
        if (productClientRepository.all().isEmpty()) {
            productService.all().forEach(productEntity -> {
                productClientRepository.add(new ProductClientObject(productEntity));
            });
        }
        List<ProductClientObject> productClientList = new ArrayList<ProductClientObject>();

        System.out.println("Size: " + productClientRepository.all().size());
        for (int i = productClientRepository.all().size() - 1; i > productClientRepository.all().size() - 7; i--) {
            productClientList.add(productClientRepository.getById(i));
        }
        return productClientList;
    }

    @GetMapping("/getsp")
    public @ResponseBody
    List<ProductClientObject> getSp(@RequestParam(name = "page", required = false, defaultValue = "1") Integer page) {
        if (productClientRepository.all().isEmpty()) {
            productService.all().forEach(productEntity -> {
                productClientRepository.add(new ProductClientObject(productEntity));
            });
        }
        List<ProductClientObject> productClientList = new ArrayList<ProductClientObject>();

        for (int i = (page - 1) * 5; i < page * 5; i++) {
            if (i > (productClientRepository.all().size() - 1)) {
                break;
            }
            productClientList.add(productClientRepository.getById(i));
        }
        return productClientList;
    }
}
