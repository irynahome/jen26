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
public class RectangleArea {
    
    public static void main(String[] args) {
        int l, w;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        l = sc.nextInt();
        System.out.println("Enter width: ");
        w = sc.nextInt();
        
        System.out.println("Rectangle Area: " + l*w);
    }
    
}
