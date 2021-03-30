/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore;

import com.techstore.services.ProductService;
import com.techstore.techstore.entities.OrderDetail;
import com.techstore.techstore.entities.OrderEntity;
import com.techstore.techstore.entities.ProductEntity;
import java.util.ArrayList;
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
        int Quantity = 1;

        if (productService.get(id) != null) {
            if (session.getAttribute("order") == null) {
                OrderEntity order = new OrderEntity();
                List<OrderDetail> listSP = new ArrayList<OrderDetail>();
                OrderDetail SP = new OrderDetail();
                SP.setProduct(productService.get(id));
                SP.setQuantity(Quantity);
                listSP.add(SP);
                order.setOrderDetails(listSP);
                req.getSession().setAttribute("order", order);
            } else {

                OrderEntity order = (OrderEntity) session.getAttribute("order");
                List<OrderDetail> listSP = order.getOrderDetails();
                boolean check = true;
                for (OrderDetail SP : listSP) {
                    if (SP.getId() == id) {
                        check = false;
                        SP.setQuantity(SP.getQuantity() + Quantity);
                        break;
                    }
                }

                if (check) {
                    OrderDetail SP = new OrderDetail();
                    SP.setProduct(productService.get(id));
                    SP.setQuantity(Quantity);
                    listSP.add(SP);
                    order.setOrderDetails(listSP);
                    req.getSession().setAttribute("order", order);
                }

            }
        }
        return "redirect:/giohang";
    }
}
