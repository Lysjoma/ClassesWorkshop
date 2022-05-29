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
//The class bank account is created with its parameters
public class BankAccount {
    private int accountNumber;
    private boolean activated;
    
    //The constructor empty and the constructor with all attrubutes are created.

    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    
    public BankAccount() {
        
    }
    //The setters and getters for every attrubute are created.
    
    /**
     * @return the accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the activated
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * @param activated the activated to set
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    //If the user wants to see the values after set them, a ToString method is created

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + getAccountNumber() + ", activated=" + isActivated() + '}';
    }
     public String isActive(boolean isActivated){
        if (isActivated) {//The public method is active is created to know if our account is active or no.
            //If we pass the attribute value as a false, we will kno our bank account is inactive, otherwise, the account is active, we will know that with the if condition.
            return "Your bank account is active";
        }else {
            return "The bank account is inactive";
        }
    }

    
    
    
}
