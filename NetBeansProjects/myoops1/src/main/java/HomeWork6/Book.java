/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeWork6;

/**
 *
 * @author Iryna
 */
public class Book {
    //id, title, author, page, price
    private int id, page;
    private double price;
    private String title, author;

    public Book() {
    }

    public Book(int id, int page, double price, String title, String author) {
        this.id = id;
        this.page = page;
        this.price = price;
        this.title = title;
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public int getPage() {
        return page;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", page=" + page + ", price=" + price + ", title=" + title + ", author=" + author + '}';
    }
    
    
    
    
}
