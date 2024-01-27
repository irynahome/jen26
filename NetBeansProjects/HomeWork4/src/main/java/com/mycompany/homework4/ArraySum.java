/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework4;

import java.util.Scanner;

/**
 *
 * @author Iryna
 */
public class ArraySum {
    
    public static void main(String[] args) {
        
        int[] myArr = new int[5];  
        int total = 0;
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < myArr.length; i++ ){
            System.out.println("Enter number: ");
            myArr[i] = sc.nextInt();            
        }
        
        //sumOfArrNum
        for (int i = 0; i < myArr.length; i++ ){            
            total = total + myArr[i];   
        }        
        System.out.println("Sum of numbers in Array is: " + total);
        
        //maxNumInArr
        int myMax=0;
        for (int i = 0; i < myArr.length; i++ ){            
            //total = total + myArr[i];   
            if ( i == 0){
                myMax = myArr[i];
            }
            if (myArr[i] > myMax){
                myMax = myArr[i];
            }
        }          
        System.out.println("Max number in Array is: " + myMax);      
        
    }
    
}
