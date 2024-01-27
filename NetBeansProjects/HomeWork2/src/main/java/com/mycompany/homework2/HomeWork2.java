/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework2;

import java.util.Scanner;

/**
 *
 * @author Iryna
 */
public class HomeWork2 {

    public static void main(String[] args) {
        int num;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num = sc.nextInt();
        if (num > 0){
            System.out.println("Positive number.");
        }else if (num < 0){
            System.out.println("Nagative number.");
        }else {
            System.out.println("Input was 0.");
        }
        
    }
}
