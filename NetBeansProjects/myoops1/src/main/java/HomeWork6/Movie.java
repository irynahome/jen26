/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeWork6;

/**
 *
 * @author Iryna
 */
public class Movie {
    //id, name, year, type
    private int id;
    private int year;
    private String name;
    private String type;

    public Movie() {
    }

    public Movie(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public Movie(int id, int year, String name, String type) {
        this.id = id;
        this.year = year;
        this.name = name;
        this.type = type;
    }
    
    

    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", year=" + year + ", name=" + name + ", type=" + type + '}';
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    
    
}
