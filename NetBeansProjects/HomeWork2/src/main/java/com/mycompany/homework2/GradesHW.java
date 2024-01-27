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
public class GradesHW {
    public static void main(String[] args) {
        int sub1, sub2, sub3, total, avg;
        String name, grade;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter grade for subject1: ");
        sub1 = sc.nextInt();
        System.out.println("Enter grade for subject2: ");
        sub2 = sc.nextInt();
        System.out.println("Enter grade for subject3: ");
        sub3 = sc.nextInt();
        total = sub1 + sub2+ sub3;
        avg = total/3;
        if(avg > 60){
            grade = "Pass";
        }else{
            grade = "Fail";
        }      
        
        System.out.println("Hello " + name);
        System.out.println("sub1: " + sub1 + "\n" + "sub2: " + sub2 + "\n" + "sub3: " + sub3);
        System.out.println("Total: " + total + "\n" + "Avarage: " + avg + "\n" + "Grade: " + grade + "\n");
            
        
        
    }
    
}
