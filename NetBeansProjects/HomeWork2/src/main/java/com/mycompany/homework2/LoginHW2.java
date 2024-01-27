/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework2;

import java.util.Scanner;

/**
 *
 * @author Iryna
 */
public class LoginHW2 {
    public static void main(String[] args) {
        
    final String myname = "Iryna", mypwd = "ir123", mypin = "777";
    String name, pwd, pin;
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name: ");
    name = sc.next();
    System.out.println("Enter your password: ");
    pwd = sc.next();
    System.out.println("Enter your pin: ");
    pin = sc.next();     

    if (myname.equalsIgnoreCase(name) && mypwd.equals(pwd)
            && mypin.equals(pin)){
            System.out.println("Login saccessful!");
        }else{
            System.out.println("Login failed!");
        }
    }    
}
