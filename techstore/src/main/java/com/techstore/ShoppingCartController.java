/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore;

import com.techstore.services.ProductService;
import com.techstore.techstore.entities.OrderDetail;
import com.techstore.techstore.entities.ProductEntity;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShoppingCartController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/giohang")
    public String showGioHang(HttpSession session,
            Model model,
            HttpServletRequest req
            ) {
        if (session.getAttribute("order") != null) {
            model.addAttribute("order", session.getAttribute("order"));
        } 
        return "shoppingcart";
    }

    @RequestMapping("/giohang/addTocart/{id}")
    public String addGioHang(HttpSession session,
            Model model,
            HttpServletRequest req,
            @PathVariable(name = "id") Long id) {
        int Quantity=1;
        
        if(productService.get(id)!=null){
            if(session.getAttribute("order")==null){
                List<OrderDetail> listOrder =null;
                OrderDetail order = new OrderDetail();
                order.setProduct(productService.get(id));
                order.setQuantity(Quantity);
                listOrder.add(order);
                req.getSession().setAttribute("order", listOrder);
            }
        }
        return "redirect:/giohang";
    }
}
