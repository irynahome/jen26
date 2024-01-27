/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework4;

/**
 *
 * @author Iryna
 */
public class HomeWork4 {

    public static void main(String[] args) {
        
        System.out.println(add(5,6,10));  
        System.out.println(salary(10, 15));
        System.out.println(mph(300,10));
        System.out.println("Minimum number is: " + min(20,30));
        System.out.println("Maximum number is: " + max(20,30));
        System.out.println(findGrade(90,90,100));
        
    }
    
    static int add(int a, int b, int c){        
        return a + b + c;
    }
    
    static int salary(int hr, int rate){        
        return (hr * rate);
    }
    
    static int mph(int miles, int gallon){
        return (miles/gallon);
    }
    
    static int min(int a, int b){
         if (a < b){
             return a;
         }
         return b;
    }
    
     static int max(int a, int b){
         if (a > b){
             return a;
         }
         return b;
    }
     
     static char findGrade(int s1, int s2, int s3){
        int total = (s1+s2+s3)/3;
        
                
        if (total >= 90){
            return 'A';
        }else if(total >= 80) {
            return 'B';
        }else if(total >= 70) {
            return 'C';
        }else if(total >= 60) {
            return 'D';
        }      
         
        return 'E';
     }
    
}
