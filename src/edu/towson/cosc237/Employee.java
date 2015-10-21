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
public interface Employee {
    
    public final String PLACEOFEMPLOYMENT = "Towson University";
    
    public String getEmployeeID(); 
    public double getSalary(); 
    public void setEmployeeID(String id); 
    public void setSalary(double salary); 

}
