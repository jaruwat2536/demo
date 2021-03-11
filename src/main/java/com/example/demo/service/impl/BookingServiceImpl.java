/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service.impl;

import com.example.demo.commons.Color;
import com.example.demo.commons.Size;
import com.example.demo.model.Product;
import com.example.demo.model.Cart;
import com.example.demo.model.IceCream;
import com.example.demo.service.BookingService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jaruwatj
 */
@Service
public class BookingServiceImpl implements BookingService {

    public static Cart cartIstance = null;

    @Override
    public Cart getInstanceCart() {
        if (cartIstance == null) {
            cartIstance = new Cart();
            cartIstance.setProductList(new ArrayList());
        }
        return cartIstance;
    }

    @Override
    public void Booking(String id, String name, String color, String size, String quantity) {
        Product product = null;
        switch (Integer.valueOf(id)) {
            case 1:
                product = new IceCream();

        }
        product.setName(name);
        product.setColor(Color.getColor(color));
        product.setSize(Size.getSize(size));
        product.setQuantity(Integer.valueOf(quantity));

        Cart cart = getInstanceCart();
        List<Product> productList = cart.getProductList();
        productList.add(product);
        cart.setProductList(productList);
    }

}
