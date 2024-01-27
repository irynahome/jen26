/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeWork6;

/**
 *
 * @author Iryna
 */
public class Triangle {   
    private int base, height;
    private double area, perimeter;

    public Triangle() {
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public double getArea() {
        area = (base * height)/2;
        return area;
    }

    public double getPerimeter() {
        double temp;
        temp = Math.sqrt(base * base + height * height);
        perimeter = temp + base + height;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + ", area=" + getArea() + ", perimeter=" + getPerimeter() + '}';
    }
    
    
    
    
}
