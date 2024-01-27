/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankproject;

/**
 *
 * @author Iryna
 */
public class FullTiimeEmployee extends Employee {
    private float salary;

    public FullTiimeEmployee(float salary, int id, String name, String title, String email) {
        super(id, name, title, email);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FullTiimeEmployee{" + "salary=" + salary + " " + super.toString() + '}';
    }
    
    
    
}
