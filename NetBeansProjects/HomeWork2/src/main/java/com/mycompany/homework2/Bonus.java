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
public class Bonus {
    public static void main(String[] args) {
        int years, salary;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter years of service: ");
        years = sc.nextInt();
        System.out.println("Enter your salary: ");
        salary = sc.nextInt();
        
        if(years >= 5 && salary > 5000){
            System.out.println("You getting 2000 bonus!");
        }else{
            System.out.println("You getting 1000 bonus!");
        }      
        
    }
    
}
