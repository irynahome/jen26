/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javatest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 *
 * @author Iryna
 */
public class readFile {
    
     public static void main(String[] args) {
     
        int id;
        String name;
        String email;
        String mypath = "c:\\ITExportsSchool\\myTestFile.txt";
        String myStr = "";
        
    try{
    
        FileReader fr = new FileReader(mypath);
        //Create Buffer
        BufferedReader br = new BufferedReader(fr);
        //myStr = br.readLine();
        
        for (String x = br.readLine(); x!=null; x = br.readLine() ){
            //System.out.println(x);
            StringTokenizer st = new StringTokenizer(x,"|");
            int cntr= 0;
            String id1 = "";
            name="";
            email="";
            while (st.hasMoreElements()){

               if (cntr==0){
                   id1 = (String)st.nextToken(); 
               }
               if (cntr==1){
                   name = (String)st.nextToken(); 
               }
               if (cntr==2){
                   email = (String)st.nextToken(); 
                   System.out.println(id1 + "|" + email + "|" + name); 
               }
               
               cntr++;
            }
            
        }
       

        br.close();
        fr.close();
    }catch(Exception e){
    
           System.out.println("Error when read form File. Error msg: "+ e.getMessage());
    }
         
         
     }
    
  
   
   
        
    
  

    
}
