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
//The class country is created with its attributes.
public class Country {
    private String name;
    private float size;
    private ArrayList<String> cities;
    private double numberOfPeople;
    
    //The constructors empty and full are created.

    public Country(String name, float size, ArrayList<String> cities, double numberOfPeople) {
        this.name = name;
        this.size = size;
        this.cities = cities;
        this.numberOfPeople = numberOfPeople;
    }

    public Country() {
        
    }
    //The setters and the getters are created, also the toString method if the user wants to see the values he set to the object already instantiated. 

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
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(float size) {
        this.size = size;
    }

    /**
     * @return the cities
     */
    public ArrayList<String> getCities() {
        return cities;
    }

    /**
     * @param cities the cities to set
     */
    public void setCities(ArrayList<String> cities) {
        this.cities = cities;
    }

    /**
     * @return the numberOfPeople
     */
    public double getNumberOfPeople() {
        return numberOfPeople;
    }

    /**
     * @param numberOfPeople the numberOfPeople to set
     */
    public void setNumberOfPeople(double numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ", size=" + size + ", cities=" + cities + ", numberOfPeople=" + numberOfPeople + '}';
    } 
}
