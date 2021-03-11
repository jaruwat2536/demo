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
public enum Color {
    RED, BLUE, GREEN;

    public static Color getColor(String colorName) {
        for (Color color : Color.values()) {
            if (color.name().equalsIgnoreCase(colorName)) {
                return color;
            }
        }
        return null;
    }
}
