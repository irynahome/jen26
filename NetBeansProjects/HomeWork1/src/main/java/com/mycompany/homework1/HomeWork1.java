/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework1;

/**
 *
 * @author Iryna
 */
public class HomeWork1 {

    public static void main(String[] args) {
        HomeWork1 mycalc = new HomeWork1();
        int result = mycalc.calcAreaRect(10, 20);
        System.out.println(result);
        
        result = mycalc.calcMilesRG(300, 10);
        System.out.println(result);
        
        result = mycalc.calcWeeklySealary(30, 15);
        System.out.println(result); 
        
        //--------------
        for (int outer =1; outer<=5; outer++ ){
            for (int inner = 0; inner<outer; inner++){
                    System.out.print("*");
            }
            System.out.println();
        }	
        
        //-----------------
        
        
        
     
    }
    
     public int calcAreaRect(int l, int w){
      
        return l * w;
    }
    
    public int calcMilesRG(int m, int g){
        
    return m/g;
    }
    
    public int calcWeeklySealary(int h, int rate){
        
    return h*rate;
    }
    
}
