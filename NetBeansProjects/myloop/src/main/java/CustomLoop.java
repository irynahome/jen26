
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Iryna
 */
public class CustomLoop {
    public static void main(String[] args) {
        int start, end, increment, i;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter start value:");
        start = sc.nextInt();
        
        System.out.println("Enter end value:");
        end = sc.nextInt();
        
        System.out.println("Enter increment value:");
        increment = sc.nextInt();
        
        for (i = start; i< end; i = i + increment){            
            System.out.println(i);
        }
        
        
        
        
        
    }
    
}
