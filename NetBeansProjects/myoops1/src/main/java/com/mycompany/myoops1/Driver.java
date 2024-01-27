/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myoops1;

/**
 *
 * @author Iryna
 */
public class Driver {
    public static void main(String[] args) {
        
        //using Empty constractor
        Student st1 = new Student();
        st1.setfName("Iryna");
        st1.setlName("Reilly");
        System.out.println(st1);
        
        
        
        //using custom constructor
        Student st2 = new Student("Donald", "Reilly");       
        System.out.println(st2);
        
        Rectangle rect1 = new Rectangle(100, 500);
        System.out.println(rect1);
        System.out.println(rect1.getAria());
        System.out.println(rect1.getPerimeter());
        
        Rectangle rect2 = new Rectangle(16, 36);
        System.out.println(rect2);
        System.out.println("aria = " + rect2.getAria());
        System.out.println("Perimeter = " + rect2.getPerimeter());
        
        
    }
    
}
