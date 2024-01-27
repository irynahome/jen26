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
public class Customer {
    private String fname;
    private String lname;
    private String email;
    ArrayList<Account> accntLst = new ArrayList<Account>();

    public Customer(String fname, String lname, String email) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }
    

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Account> getAccntLst() {
        return accntLst;
    }

    public void setAccntLst(ArrayList<Account> accntLst) {
        this.accntLst = accntLst;
    }

    @Override
    public String toString() {
        return "Customer{" + "fname=" + fname + ", lname=" + lname + ", email=" + email + ", accntLst=" + accntLst + '}';
    }
    
    
}
