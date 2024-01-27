/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mybank;

import java.util.ArrayList;


/**
 *
 * @author Iryna
 */
public class Bank {
    private String name;
    private String city;
    ArrayList<Customer> custLst = new ArrayList<Customer>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Customer> getCustLst() {
        return custLst;
    }

    public void setCustLst(ArrayList<Customer> custLst) {
        this.custLst = custLst;
    }

    public Bank(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Bank{" + "name=" + name + ", city=" + city + ", custLst=" + custLst + '}';
    }
    
    
    
}
