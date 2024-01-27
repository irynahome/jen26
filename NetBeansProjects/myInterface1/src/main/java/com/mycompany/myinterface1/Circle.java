/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myinterface1;

/**
 *
 * @author Iryna
 */
public class Circle implements Shape {
     private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
     
     

    @Override
    public void area() {
        float area = 3.14f * this.radius * this.radius;
        System.out.println("area =" + area);
    }
    
    
}
