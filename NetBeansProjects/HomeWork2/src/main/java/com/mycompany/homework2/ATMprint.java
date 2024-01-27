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
public class ATMprint {
    public static void main(String[] args) {
        int ret;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Deposit, 2 for Withdraw, 4 for Quit");
        ret = sc.nextInt();
        
        switch (ret){
            case 1:
                System.out.println("Deposit"); break;
            case 2:
                System.out.println("Withdraw");break;
            case 4:
                System.out.println("Quit");break;
            default:
                System.out.println("Wrong enter!");break;
        }        
    }    
}
