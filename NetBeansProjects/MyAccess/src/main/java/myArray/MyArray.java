/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myArray;

/**
 *
 * @author Iryna
 */
public class MyArray {
    public static void main(String[] args) {
        int x = 5;
        x = 7;
        //int score[] = new int[2];
        int score[] = {90, 80, 50, 70, 85};
//        score[0] = 90;
//        score[1] = 85;

//        String friends [] = {"ron", "don", "tom", "val"};        
//        System.out.println("x="+x);
//        System.out.println("Score " + score[1]);        
//        System.out.println("Friend " + friends[1]);
        
        int total = 0;
        for (int i = 0; i<score.length; i++){
            System.out.println("score"+"i = " + score[i]);
            total = total + score[i];
            
        }
        
        System.out.println("Total = " + total);
        System.out.println("Avarage = " + total/score.length);
    }
    
}
