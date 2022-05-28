/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softka.classes;

/**
 *
 * @author Sebastian
 */
//The class Celphone is created with its attributes.
public class Cellphone {
    private int number;
    private String operator;
    private String country;
    
    //The constructors empty and full are created.

    public Cellphone(int number, String operator, String country) {
        this.number = number;
        this.operator = operator;
        this.country = country;
    }

    public Cellphone() {
        
    }
    //The setters and getters for all attributes are created and also the toString method if the user wants to see the values when an object is instantiated.

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator the operator to set
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Cellphone{" + "number=" + number + ", operator=" + operator + ", country=" + country + '}';
    }  
    //In this situation I have created a method to concatenate the values we set in the cellphone instance in the main class.
    public String thisIsAChain(){
        return number+" "+operator+" "+country; //We just returned the values but in just one line.
    }
}
