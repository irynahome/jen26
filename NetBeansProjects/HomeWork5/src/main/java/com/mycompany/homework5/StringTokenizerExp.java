/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework5;

import java.util.StringTokenizer;

/**
 *
 * @author Iryna
 */
public class StringTokenizerExp {
    public static void main(String[] args) {
        
        String myStr ="mike@abc.com=mike|tom@abc.com=tom|kevin@abc.com=kevin|amy@abc.com=amy";
        String name, email;
        StringTokenizer st = new StringTokenizer(myStr,"|");
        while (st.hasMoreElements()) {
            String tempStr = (String)st.nextToken();           
            StringTokenizer st1 = new StringTokenizer(tempStr,"=");
            
            int cntr= 0;
            name="";
            email="";
            
            while (st1.hasMoreElements()) {
                String tempStr1 = (String)st1.nextToken();                
                if (cntr==0){
                    email = tempStr1;
                }else{
                    name = tempStr1;
                }
                cntr++;  
            }
            System.out.println( name + "=" + email);
            
        } 
        
    }
    
}
