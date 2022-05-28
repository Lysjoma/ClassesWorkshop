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
//The class cat is created with its respective attibutes.
public class Cat {
    private String color;
    private boolean hungry;
    private int age;
    private String name;
    
    //The constructors empty and full are created.

    public Cat(String color, boolean hungry, int age, String name) {
        this.color = color;
        this.hungry = hungry;
        this.age = age;
        this.name = name;
    }

    public Cat() {
        
    }
    
    //The setters and getters are created, and also the toString method if the user wants to see the values in the main class.

    /**
     * @return the color
     */
    protected String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the hungry
     */
    public boolean isHungry() {
        return hungry;
    }

    /**
     * @param hungry the hungry to set
     */
    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    /**
     * @return the age
     */
    private int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Cat{" + "color=" + color + ", hungry=" + hungry + ", age=" + age + ", name=" + name + '}';
    }
    
    public String isHungry(boolean hungry){
        if (hungry) {//The public method is hungry is created to know if our cat need food or no, with the If wi will know that.
            //It receives a boolean parameter, it means if is true, our cat is hungry, if it is else our cat is okay.
            return "Please feed your Cat";
        }else {
            return "The cat is okay";
        }
    }
    
}
