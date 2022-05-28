/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softka.classes;

import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
//The class fuit is created with the respective attributes.
public class Fruit {
    private String name;
    private Float averageWeight;
    private ArrayList<String> colors;
    
    //The constructor empty and the constructor with parameters are created.

    public Fruit(String name, Float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    public Fruit() {
        
    }
    
    //The setters and getters for all attributes are created.

    /**
     * @return the name
     */
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
     * @return the averageWeight
     */
    public Float getAverageWeight() {
        return averageWeight;
    }

    /**
     * @param averageWeight the averageWeight to set
     */
    public void setAverageWeight(Float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * @return the colors
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * @param colors the colors to set
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
    //If the user wants to see the values, a ToString method is included too.

    @Override
    public String toString() {
        return "Fruit{" + "name=" + name + ", averageWeight=" + averageWeight + ", colors=" + colors + '}';
    }

    
    
}
