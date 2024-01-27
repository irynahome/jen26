/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myinterface1;

/**
 *
 * @author Iryna
 */
public class Car {
    private int vin;
    private String make;
    private Color color;

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Car(int vin, String make, Color color) {
        this.vin = vin;
        this.make = make;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + "vin=" + vin + ", make=" + make + ", color=" + color + '}';
    }
    
    
    
}
