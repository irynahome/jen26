/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myoops1;

/**
 *
 * @author Iryna
 */
public class Student {
    
    private String fName;
    private String lName;

    @Override
    public String toString() {
        return "Student{" + "fName=" + fName + ", lName=" + lName + '}';
    }

    public Student() {
    }

    public Student(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }
    
    

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
    
    
    
}
