/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankproject;

/**
 *
 * @author Iryna
 */
public class Account {
   private int acctNum;
   private int cust_id;
   private double balance;
   private AccountType acctType; 

  

    public Account(int acctNum, int cust_id, double balance, AccountType acctType) {
        this.acctNum = acctNum;
        this.cust_id = cust_id;
        this.balance = balance;
        this.acctType = acctType;
    }
   

     public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(int acctNum) {
        this.acctNum = acctNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getAcctType() {
        return acctType;
    }

    public void setAcctType(AccountType acctType) {
        this.acctType = acctType;
    }

    @Override
    public String toString() {
        return "Account{" + "acctNum=" + acctNum + ", cust_id=" + cust_id + ", balance=" + balance + ", acctType=" + acctType + '}';
    }

   
   
   
}
