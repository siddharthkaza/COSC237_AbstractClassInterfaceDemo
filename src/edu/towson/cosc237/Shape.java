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
public abstract class Shape {
    
    public abstract double area();
    
    @Override
    public String toString() {
        return "I am a Shape. That's all I know. I hope my subclasses do a better job overriding toString()";
    }
    
    
}
