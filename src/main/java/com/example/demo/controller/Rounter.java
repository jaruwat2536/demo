/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.service.BookingService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.model.Product;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.model.ListProduct;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Jaruwatj
 */
@Controller
public class Rounter {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/")
    public String index(ModelMap model) {
        List<Product> list = bookingService.getInstanceCart().productList;
        model.addAttribute("total", "Cart (" + list.size() + ")");
        model.addAttribute("cart", list);
        model.addAttribute("listProduct", bookingService.getListProduct());
        return "index";
    }
}
