/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mybank;

/**
 *
 * @author Iryna
 */
public class Account {
    private int id;
    private String type;
    private int balance;

    public Account(int id, String type, int balance) {
        this.id = id;
        this.type = type;
        this.balance = balance;
    }
    
    

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", type=" + type + ", balance=" + balance + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
}
