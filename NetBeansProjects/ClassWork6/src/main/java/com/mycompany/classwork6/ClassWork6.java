/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classwork6;

import java.util.ArrayList;

/**
 *
 * @author Iryna
 */
public class ClassWork6 {

    public static void main(String[] args) {
        //ArayList clas
        String friends[] = new String[3];
        friends[0] = "amy";
        friends[1] = "tom";
        friends[2] = "bob";
        
        for (int i = 0; i < friends.length; i++ ){
            System.out.println(friends[i]);
        }
        
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        for (String color : colors){
            System.out.println(color);
        }
        
       
        
        
    }
}
