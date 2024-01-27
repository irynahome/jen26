
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Iryna
 */
public class Mpg {
    public static void main(String[] args) {
        
        int miles, gallon, mpg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter miles; ");
        miles = sc.nextInt();
        
        System.out.println("Enter gallon; ");
        gallon = sc.nextInt();
        
        mpg = miles/gallon;
        System.out.println("mpg: " + mpg);
        
    }
    
            
    
}
