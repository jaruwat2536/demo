/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import com.example.demo.commons.Color;
import com.example.demo.commons.Size;
import lombok.Data;

/**
 *
 * @author Jaruwatj
 */
@Data
public class Product {

    private String imgSrc;
    private String name;
    private Color color;
    private Size size;
    private Integer quantity;
}
