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
public class Date implements Comparable {
    private int day;
    private int month;
    private int year;

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        Date copy = (Date)super.clone();
        copy.day = day;
        copy.month = month;
        copy.year = year;
        return copy;
    }
    

    @Override
    public int compareTo(Object o) {
        Date otherDate = (Date)o;
        if (this.year != otherDate.year) 
            return this.year - otherDate.year;
        
        //write the rest
        
        return 0;  
    }
}
