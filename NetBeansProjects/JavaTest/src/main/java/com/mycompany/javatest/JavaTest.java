/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javatest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Iryna
 */
public class JavaTest {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int id;
         String name;
         String email;
         String mypath = "c:\\ITExportsSchool\\myTestFile.txt";
         
        try{
            
            FileWriter fw = new FileWriter(mypath);
            BufferedWriter bw = new BufferedWriter(fw);
                 
            for (int i=0; i<=2; i++){
               System.out.println("Enter id:");
               id = sc.nextInt();
               System.out.println("Enter name:");
               name = sc.next();
               System.out.println("Enter email:");
               email = sc.next();
               //writeToFile(id, name, email);    
              
               bw.write(id + "|" + name + "|" + email + "\n");
            }  
            
            bw.close();
            fw.close();
         
        }catch(Exception e){
           System.out.println("Error when save to File. Error msg: "+ e.getMessage());
        }
        
        //reating from file
        
        
       
        
    }
    
    
   
   
}
