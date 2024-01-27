/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myinterface1;

/**
 *
 * @author Iryna
 */
public class Driver {
    public static void main(String[] args) {
        Shape shape = new Rectangle(10, 5);
        shape.area();
        
        shape = new Circle(2.0f);
        shape.area();
        
        Car car = new Car(77777, "Nonda", Color.RED);
        System.out.println(car);
        
        car = new Car(8888, "Tayota", Color.WHITE);
        System.out.println(car);
    }
}
