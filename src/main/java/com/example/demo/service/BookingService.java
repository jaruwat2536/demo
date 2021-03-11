/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.Cart;
import java.util.Map;

/**
 *
 * @author Jaruwatj
 */
public interface BookingService {

    public Cart getInstanceCart();

    public void Booking(String id, String name, String color, String size, String quantity);

}
