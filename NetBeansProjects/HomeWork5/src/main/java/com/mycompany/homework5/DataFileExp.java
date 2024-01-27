/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

/**
 *
 * @author Iryna
 */
public class DataFileExp {
    
    public static void main(String[] args) {
       
        String myInpStr = "mike@abc.com=mike, tom@abc.com=tom, kevin@abc.com=kevin, amy@abc.com=amy";
        String filePathName = "c:\\ITExportsSchool\\myDataFile.txt";
        String myStrFromFile = "";
        createDataFile(myInpStr, filePathName);
        myStrFromFile = readFileForOutput(filePathName);      
        formatOutput(myStrFromFile);
        
    }
    
    public static void createDataFile(String mystr, String filePathName){
       
        //System.out.println(mystr);
        //System.out.println(filePathName);
        
        try{
            //Write File, true for append
            FileWriter fw = new FileWriter(filePathName);
            //Create Buffer
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(mystr);
            bw.close();
            fw.close();
             
            
        }catch(Exception e){
            
            System.out.println("Error when creating file: " + e.getMessage());
        }
        
        
    }
    
    public static String readFileForOutput(String filePathName){
        
        String myReturnStr = "";
        try{
            
            //Create File
            FileReader fr = new FileReader(filePathName);
            //Create Buffer
            BufferedReader br = new BufferedReader(fr);
            myReturnStr = br.readLine();
            
            br.close();
            fr.close();
            
        }catch(Exception e){
            
            System.out.println("Error when reading file: " + e.getMessage());
        }      
        
        return myReturnStr;
        
    }
    
    public static void formatOutput(String myLine){
        
        String name, email, strOutput;
        strOutput = "";
        StringTokenizer st = new StringTokenizer(myLine,",");
        while (st.hasMoreElements()) {
            String tempStr = (String)st.nextToken();           
            StringTokenizer st1 = new StringTokenizer(tempStr,"=");
            
            int cntr= 0;
            name="";
            email="";
            
            while (st1.hasMoreElements()) {
                String tempStr1 = (String)st1.nextToken().trim();                
                if (cntr==0){
                    email = tempStr1;
                }else{
                    name = tempStr1;
                }
                cntr++;  
            }                        
            strOutput = strOutput + name + "=" + email + " ";            
        } 
        
        System.out.println(strOutput);
        
    }
    
}
