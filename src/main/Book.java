package main;

import java.util.List;

public class Book {
    private int id;
    private String title;
    private String author;
    private List<String> genre;
    private int quantity;
    private int totalQuantity;

    public Book(int id, String title, String author, List<String> genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.quantity = 1;
        this.totalQuantity = 1;
    }

    public int getId() {return id;}

    public String getTitle() {return title;}

    public String getAuthor() {return author;}

    public List<String> getGenre() {return genre;}

    public int getQuantity() {return quantity;}

    public int getTotalQuantity() {return totalQuantity;}
}
