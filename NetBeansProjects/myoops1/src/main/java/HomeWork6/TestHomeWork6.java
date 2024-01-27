/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeWork6;

/**
 *
 * @author Iryna
 */
public class TestHomeWork6 {
    public static void main(String[] args) {
        
        Movie myMovie = new Movie();
        myMovie.setId(777);
        myMovie.setName("The Wizard of Oz");
        myMovie.setType("Musical fantasy");
        myMovie.setYear(1939);
        System.out.println(myMovie.toString());        
        System.out.println("My favorite movie is: " + myMovie.getName());
        System.out.println("This is classic " + myMovie.getType() + " made in year " + myMovie.getYear());
        
        Book mybook = new Book();
        mybook.setId(777);
        mybook.setAuthor("George Orwell");
        mybook.setTitle("1984");
        mybook.setPage(400);
        mybook.setPrice(29.99);
        System.out.println(mybook.toString());
        System.out.println("Book you must to read: " + mybook.getTitle() + " by " + mybook.getAuthor());
        System.out.println("Book has " + mybook.getPage() + " pages and cost $" + mybook.getPrice());
        
        Doctor doc = new Doctor();
        doc.setId(7);
        doc.setFirstName("Alexander");
        doc.setLastName("Rabinovich");
        doc.setPhone("888-987-6543");
        doc.setEmail("a.rabinovich@gmail.com");
        System.out.println(doc.toString());
        
        Circle cir = new Circle();
        cir.setRadius(7.7);        
        System.out.println(cir.toString());
        
        Triangle tr = new Triangle(7, 10);
        System.out.println(tr.toString());
        
        
        
        
    }
    
}
