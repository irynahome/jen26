/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeWork6;

import java.text.DecimalFormat;

/**
 *
 * @author Iryna
 */
public class Circle {
    //radius and calculate Area and Perimeter for Circle
    private double radius, area, perimeter;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        area = Math.PI * radius * radius;               
        return area;
    }

    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;        
        return perimeter;
    }

    @Override
    public String toString() {
        DecimalFormat frmt = new DecimalFormat("###.00");  
        return "Circle{" + "radius=" + radius + ", area=" + frmt.format(getArea()) + ", perimeter=" + frmt.format(getPerimeter()) + '}';
    }
    
    
    
    
    
    
}
