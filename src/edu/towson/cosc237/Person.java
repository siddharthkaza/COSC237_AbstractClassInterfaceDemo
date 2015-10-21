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
public class Person {
    private String firstName;
    private Date birthDate;

    /**
     * @return the name
     */
    public String getName() {
        return firstName;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.firstName = name;
    }
    
    @Override
    public Person clone() throws CloneNotSupportedException {
        Person copy = (Person) super.clone();
        copy.birthDate = (Date) birthDate.clone();
        copy.firstName = firstName;
        return copy;        
    }
    
}
