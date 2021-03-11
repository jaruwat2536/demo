/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

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
        model.addAttribute("total", "Cart (" + bookingService.getInstanceCart().productList.size() + ")");
        return "index";
    }
}
