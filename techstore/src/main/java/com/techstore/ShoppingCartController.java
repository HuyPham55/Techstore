/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore;

import com.techstore.services.CustomerService;
import com.techstore.services.OrderDetailService;
import com.techstore.services.OrderService;
import com.techstore.services.ProductService;
import com.techstore.techstore.entities.CustomerEntity;
import com.techstore.techstore.entities.OrderDetail;
import com.techstore.techstore.entities.OrderEntity;
import com.techstore.techstore.entities.ProductEntity;
import com.techstore.techstore.entities.SL;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ShoppingCartController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private OrderDetailService orderDetailService;
    @Autowired
    private OrderService orderService;

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
                SP.setStatus(1);
                listSP.add(SP);
                order.setOrderDetails(listSP);
                req.getSession().setAttribute("order", order);
            } else {

                OrderEntity order = (OrderEntity) session.getAttribute("order");
                List<OrderDetail> listSP = order.getOrderDetails();
                boolean check = true;
                for (OrderDetail SP : listSP) {
                    if (SP.getProduct().getId() == id) {
                        check = false;
                        SP.setQuantity(SP.getQuantity() + Quantity);
                        break;
                    }
                }
                if (check) {
                    OrderDetail SP = new OrderDetail();
                    SP.setProduct(productService.get(id));
                    SP.setQuantity(Quantity);
                    SP.setStatus(listSP.size() + 1);
                    listSP.add(SP);
                    order.setOrderDetails(listSP);
                    req.getSession().setAttribute("order", order);
                }
            }
        }
        return "redirect:/giohang";
    }

    @RequestMapping("/giohang/xoa/{id}")
    public String xoaSP(HttpSession session,
            Model model,
            HttpServletRequest req,
            @PathVariable(name = "id") Long id
    ) {
        if (productService.get(id) != null) {
            OrderEntity order = (OrderEntity) session.getAttribute("order");
            List<OrderDetail> listSP = order.getOrderDetails();
            for (OrderDetail SP : listSP) {
                if (SP.getProduct().getId() == id) {
                    listSP.remove(SP);
                    break;
                }
            }
        }
        return "redirect:/giohang";
    }
    @ResponseBody
    @PostMapping("/giohang/luu")
    public void uppdateQuantit(@RequestBody SL sl, HttpSession session, HttpServletRequest req) {
        OrderEntity order = (OrderEntity) session.getAttribute("order");
        List<OrderDetail> listSP = order.getOrderDetails();
        int i = 0;
        for (OrderDetail sp : listSP) {
            sp.setQuantity(Integer.parseInt(sl.sl[i]));
            i++;
        }
        for (OrderDetail sp : listSP) {
            System.out.println(sp.getQuantity());
        }
        order.setOrderDetails(listSP);
        req.getSession().setAttribute("order", order);
    }

    @GetMapping("/giohang/dathang")
    public String showDathang() {
        return "khachhang";
    }

    @ResponseBody
    @PostMapping("/giohang/dathang")
    public void xacnhan(@RequestBody CustomerEntity Khachhang, HttpSession session, HttpServletRequest req) {
        CustomerEntity newCustomer = new CustomerEntity();
        boolean check = true;
        List<CustomerEntity> ListCS = customerService.all();
        System.out.println(Khachhang.getEmail());
        String email = Khachhang.getEmail();
        for (CustomerEntity cs : ListCS) {
            if (cs.getEmail() != null) {
                if (cs.getEmail().equals(Khachhang.getEmail())) {
                    System.out.println(cs.getEmail());
                    check = false;
                    newCustomer = cs;
                    break;
                }
            }
        }
        if (check) {
            newCustomer = Khachhang;
            customerService.save(newCustomer);
        }
        
        OrderEntity order = (OrderEntity) session.getAttribute("order");
        
        order.setCustomer(newCustomer);
        orderService.save(order);
        List<OrderDetail> ListSP= order.getOrderDetails();
        for(OrderDetail sp: ListSP){
            orderDetailService.save(sp);
        }
        
        req.getSession().setAttribute("order", null);
    }
}
