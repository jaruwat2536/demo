/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.Cart;
import com.example.demo.model.ListProduct;
import java.util.List;

/**
 *
 * @author Jaruwatj
 */
public interface BookingService {

    public Cart getInstanceCart();

    public void Booking(String imgSrc, String name, String color, String size, String quantity);

    public List<ListProduct> getListProduct();

}
