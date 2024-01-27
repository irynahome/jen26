
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Iryna
 */
public class Grade {
    public static void main(String[] args) {
        int math, sci, eng, total, avg;
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter math: ");
        math = sc.nextInt();
        System.out.println("Enter sci: ");
        sci = sc.nextInt();
        System.out.println("Enter eng: ");
        eng = sc.nextInt();
        total = math + sci+ eng;
        avg = total/3;
        
        if(avg < 60){
            System.out.println("Sorry, grade is F!");
        }else if (avg < 70){
             System.out.println("Grade is D. ");
        }else if (avg < 80){
             System.out.println("Grade is C. ");
        }else if (avg < 90){
             System.out.println("Grade is B. ");
        }else{
            System.out.println("Grade is A. ");
        }
            
        
       
        
        
    }
}
