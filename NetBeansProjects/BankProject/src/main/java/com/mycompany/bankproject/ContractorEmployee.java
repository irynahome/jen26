/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankproject;

/**
 *
 * @author Iryna
 */
public class ContractorEmployee extends Employee {
    private float hourlyRate ;

    public ContractorEmployee(float hourlyRate, int id, String name, String title, String email) {
        super(id, name, title, email);
        this.hourlyRate = hourlyRate;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "ContractorEmployee{" + "hourlyRate=" + hourlyRate + " " + super.toString() + '}';
    }
    
    
    
}
