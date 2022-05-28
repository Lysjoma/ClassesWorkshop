/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softka.classes;

import java.util.Date;

/**
 *
 * @author Sebastian
 */
//The person class is created with its respective attributes.
public class Person {
    private String name;
    private String lastName1;
    private String lastName2;
    private Date dateBirth;
    private Float height;

    //The respective constructor with all the attributes or parameters is created.
    public Person(String name, String lastName1, String lastName2, Date dateBirth, Float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }
    
    //Another constructor with no parameters is created.

    public Person() {
        
    }
    
    
    
    //The setters and getters for all the attributes are created.
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName1
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * @param lastName1 the lastName1 to set
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     * @return the lastName2
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     * @param lastName2 the lastName2 to set
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * @return the dateBirth
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     * @param dateBirth the dateBirth to set
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * @return the height
     */
    public Float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Float height) {
        this.height = height;
    }  
    
    //If the user wants to see the values, a ToString method is included too.

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastName1=" + lastName1 + ", lastName2=" + lastName2 + ", dateBirth=" + dateBirth + ", height=" + height + '}';
    }
    
}
