/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softka.main;

import com.softka.classes.BankAccount;
import com.softka.classes.Cat;
import com.softka.classes.Cellphone;
import com.softka.classes.Country;
import com.softka.classes.Fruit;
import com.softka.classes.Person;

/**
 *
 * @author Sebastian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person();
        Fruit f = new Fruit();
        Country c = new Country();
        Cellphone ce = new Cellphone(7711175, "Claro", "Colombia");
        String chain = ce.thisIsAChain();
        System.out.println(chain);
        Cat ca = new Cat();
        String result = ca.isHungry(true);
        System.out.println(result);
        BankAccount b = new BankAccount();
        String accountActive = b.isActive(true);
        System.out.println(accountActive);
    }
    
}
