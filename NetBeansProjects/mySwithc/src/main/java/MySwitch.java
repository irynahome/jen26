
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Iryna
 */
public class MySwitch {
    public static void main(String[] args) {
        /*
        int salary = 3000;
        int bonus, total;
        bonus = salary > 5000 ? 500 : 200;
        total = salary + bonus;
        System.out.println("Total salary: " + total);
        */
        //System.out.println(salary > 5000 ? "bonud is 500" : "bonus is 200");
        
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choce from 1 to 3");
        
        choice = sc.nextInt();
        switch(choice) {
            case 1: System.out.println("You are like Taco");break;
            case 2: System.out.println("You are like MacD");break;
            case 3: System.out.println("You are like Subway");break;
            default: System.out.println("Wrong choice.");break;
            
        }
        
        
    }
    
}
