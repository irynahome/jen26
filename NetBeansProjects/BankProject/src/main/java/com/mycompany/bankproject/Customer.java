/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankproject;

import java.util.ArrayList;

/**
 *
 * @author Iryna
 */
public class Customer {
    private int id;
    private String name;
    private String email;
    private CustomerType custType;
    private ArrayList<Account> acct;

    public Customer(int id, String name, String email, CustomerType custType, ArrayList<Account> acct) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.custType = custType;
        this.acct = acct;
    }
    
    public Customer(int id, String name, String email, CustomerType custType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.custType = custType;
       
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", email=" + email + ", custType=" + custType + ", acct=" + acct + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CustomerType getCustType() {
        return custType;
    }

    public void setCustType(CustomerType custType) {
        this.custType = custType;
    }

    public ArrayList<Account> getAcct() {
        return acct;
    }

    public void setAcct(ArrayList<Account> acct) {
        this.acct = acct;
    }
    
    
    
    
}
