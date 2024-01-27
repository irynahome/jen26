/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method_func;

/**
 *
 * @author Iryna
 */
public class MyFunction {
    
    public static void main(String[] args) {
        int result = max(300, 500);
        System.out.println("result is " + result);
        
        int res1 = avg(50, 90, 90);
        if (res1 < 60){
            System.out.println("Fail");
        }else{
            System.out.println("Pass");
        }
        
        System.out.println(fullName("Iryna", "Reilly"));
    }
    
    static int max(int x, int y){
        if (x>y){
            return x;
        }else{
            return y;
        }        
    }
    
    static int avg(int a, int b, int c){
        
        return (a+b+c)/3;
    }
    
    
    static String fullName(String fn, String ln){
        
        return fn + " " + ln;
    }
    
}
