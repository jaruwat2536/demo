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
import com.example.demo.service.BookingService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.model.ListProduct;

/**
 *
 * @author Jaruwatj
 */
@Service
public class BookingServiceImpl implements BookingService {

    public static Cart cartIstance = null;
    public static List<ListProduct> listProduct = null;

    public BookingServiceImpl() {
        if (listProduct == null) {
            listProduct = new ArrayList();
            listProduct.add(new ListProduct("/img/product/iphone.png", "iphone"));
            listProduct.add(new ListProduct("/img/product/mouse.png", "mouse"));
            listProduct.add(new ListProduct("/img/product/shirt.png", "shirt"));
            listProduct.add(new ListProduct("/img/product/pants.png", "pants"));
        }
    }

    @Override
    public Cart getInstanceCart() {
        if (cartIstance == null) {
            cartIstance = new Cart();
            cartIstance.setProductList(new ArrayList());
        }
        return cartIstance;
    }

    @Override
    public void Booking(String imgSrc, String name, String color, String size, String quantity) {
        Product product = new Product();
        product.setImgSrc(imgSrc);
        product.setName(name);
        product.setColor(Color.getColor(color));
        product.setSize(Size.getSize(size));
        product.setQuantity(Integer.valueOf(quantity));

        Cart cart = getInstanceCart();
        List<Product> productList = cart.getProductList();
        productList.add(product);
        cart.setProductList(productList);
    }

    @Override
    public List<ListProduct> getListProduct() {
        return this.listProduct;
    }

}
