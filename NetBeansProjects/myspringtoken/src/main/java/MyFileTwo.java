
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Iryna
 */
public class MyFileTwo {
    public static void main(String[] args) {
        
         try{
            //Write File, true for append
             FileWriter fw = new FileWriter("c:\\ITExportsSchool\\myfile.txt");
             //Create Buffer
             BufferedWriter bw = new BufferedWriter(fw);
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter you name: ");
             String name = sc.nextLine();
             
             //Write content
             bw.write(name);
              bw.write("\n");
             bw.write("This is first line\n");
             bw.write("This is second line\n ");
             //close file
             bw.close();
             fw.close();
        } catch(Exception e) {
            //Write error message
            System.out.println(e.getMessage());
        }
         
         
         
         
    }
    
}
