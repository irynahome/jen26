
import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Iryna
 */
public class MySprintToken {
    public static void main(String[] args) {
        //String friends = "iryna,boris,yuri,don";
        String friends = "1|ira|ira@gmail.com|50.50";
        
        //StringTokenizer st = new StringTokenizer(friends,",");
//        while (st.hasMoreTokens()){
//            String token = st.nextToken();
//            System.out.println(token);
//        }

        StringTokenizer st = new StringTokenizer(friends,"|");
        int id = Integer.parseInt(st.nextToken());
        String name = st.nextToken();
        String email = st.nextToken();
        float fl = Float.parseFloat(st.nextToken());
        System.out.println(name+" has id "+id);
        System.out.println("has email "+email);
        System.out.println("has order value is "+fl);
        
        
    }
    
}
