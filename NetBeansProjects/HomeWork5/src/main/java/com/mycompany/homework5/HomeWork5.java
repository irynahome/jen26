/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Iryna
 */
public class HomeWork5 {

    public static void main(String[] args) {
        
        HashMap<String,String> hmap = new HashMap<String,String>();
        ArrayList<String> myArrLst = new ArrayList<String>();
        
        String name="", email="";
        int cntr = 0;
        
        do{
            email="";
            name="";        
            Scanner sc = new Scanner(System.in);
        
            System.out.println("Enter your freand's email: ");        
            email = sc.nextLine().trim();    
               
            System.out.println("Enter  your freand's name: ");   
            name = sc.nextLine();
        
            if(email.equals("")){
                System.out.println("You must enter valid email.");
                continue;
            }   
        
            hmap.put(email, name);   
            
            myArrLst.add("Name: " + name + " Email: " + email);
            
            cntr++;
        
            System.out.println("cntr="+cntr);
        }while(cntr < 3);        
       
        hmap.put(email, name);
        
        
        
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        } 
        
        System.out.println(myArrLst);
        
        for (int i = 0; i< myArrLst.size(); i++){            
            System.out.println(myArrLst.get(i));
        }
            
    }
}
