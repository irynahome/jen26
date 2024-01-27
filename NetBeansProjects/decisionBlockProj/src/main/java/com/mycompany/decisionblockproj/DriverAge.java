/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decisionblockproj;
import java.util.Scanner;

/**
 *
 * @author Iryna
 */
public class DriverAge {
    public static void main(String[] args){
        short age; //declare
                
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age: ");
        age = sc.nextShort();
        
      
        if (age < 16){
            System.out.println("Sorry, No driving fo you. ");
        }else {
            System.out.println("You can drive!");
        }
        
        
    }
        
    
    
    
}
