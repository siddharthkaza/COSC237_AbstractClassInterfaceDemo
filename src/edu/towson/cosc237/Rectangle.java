/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cosc237;

/**
 *
 * @author skaza
 */
public class Rectangle extends Shape {

    private double length;
    private double width;
    
    @Override
    public double area() {
        return length * width;
        
    }  
}
