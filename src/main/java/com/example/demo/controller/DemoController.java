package com.example.demo.controller;

import com.example.demo.service.BookingService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Cart;
import com.example.demo.model.Product;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@RestController
public class DemoController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/getCart")
    public Cart getCart() {
        return bookingService.getInstanceCart();
    }

    @PostMapping("/order")
    public Cart insertProduct(@RequestParam String imgSrc, @RequestParam String name, @RequestParam String color, @RequestParam String size, @RequestParam String quantity) {
        bookingService.Booking(imgSrc, name, color, size, quantity);
        return bookingService.getInstanceCart();
    }
}
