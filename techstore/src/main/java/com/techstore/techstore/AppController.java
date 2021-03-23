/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.techstore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Administrator
 */
@Controller
public class AppController {

    @RequestMapping("/")
    public String homepage() {
        return "homepage";
    }
    @RequestMapping("/thongtin")
    public String about() {
        return "about";
    }

}
