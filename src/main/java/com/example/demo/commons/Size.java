/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.commons;

/**
 *
 * @author Jaruwatj
 */
public enum Size {
    S, M, L, XL;

    public static Size getSize(String sizeName) {
        for (Size size : Size.values()) {
            if (size.name().equalsIgnoreCase(sizeName)) {
                return size;
            }
        }
        return null;
    }
}
