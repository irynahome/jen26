/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Iryna
 */
public class MyFile {
    
    public static void main(String[] args) {
        int i = 5, j = 0, c = 0;
        System.out.println("first");   
        try{
          c = i/j; 
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage()); 
        }
        catch (Exception e){
            System.out.println("catch all");  
            System.out.println(e.getMessage());
        } finally{
           System.out.println("finally"); 
        }   
        
        System.out.println("last");
    }
    
}
