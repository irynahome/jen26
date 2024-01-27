package com.mycompany.homework2;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Iryna
 */
public class MinMaxNum {
    
    public static void main(String[] args) {
        int num1, num2;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        num2 = sc.nextInt();
        
        if (num1 > num2){
            System.out.println("Muximum Number is " + num1);                
            System.out.println("Minimum Number is " + num2);
        }     
        
    }
  
   
    
}
