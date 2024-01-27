/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;

import java.util.Scanner;

/**
 *
 * @author Iryna
 */
public class Login {

    public static void main(String[] args) {
        final String username = "Iryna", password = "iryna123";
        String user, pass;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        user = sc.next();
        
         System.out.println("Enter password: ");
        pass = sc.next();
        
        if (username.equalsIgnoreCase(user) && password.equals(pass)){
            System.out.println("Login saccessful!");
        }else{
            System.out.println("Login failed!");
        }
        
        char myChar = 'a';
        
        switch(myChar)
        {
            case 'a':
            case 'A': System.out.println("It was A");
            break;
            case 'b':
            case 'B': System.out.println("It was B");
            break;
            case 'c':
            case 'C': System.out.println("It was C");
            break;            
        }
        
        
        
    }
}
