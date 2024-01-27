/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method_func;

/**
 *
 * @author Iryna
 */
public class MyMethod {
    
    public static void main(String[] args) {
        design();
        design1("############");
        add(-200, 400);
        mpg(600, 20);
    }
    
    static void design(){
        System.out.println("********"); 
         
    }
    
    static void design1(String pattern){
        System.out.println(pattern);
    }
    
    static void add(int a, int b){
        int c = a+b;
        System.out.println("c="+c);
    }
    
    static void mpg(int miles, int gallon){
        int mpg = miles/gallon;
        System.out.println("mpg="+mpg);
    }
}
