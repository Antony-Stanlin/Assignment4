package com.classesAndObjects;
public class BookDTO {

    // Static variable
    private static int bookCount = 0;

    // Instance variables
    private String title;
    private String isbn;
    private String author;
    private String publisher;
    private double price;

    // Constructor
    public BookDTO(String title, String isbn, String author, 
                    String publisher, double price) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        bookCount++;
    }

    // Getters and Setters
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    // Static method to get book count
    public static int getBookCount() {
        return bookCount;
    }

    @Override
    public String toString() {
        return """
                   %s
                  | %-10s : %-20s |
                  | %-10s : %-20s |
                  | %-10s : %-20s |
                  | %-10s : %-20s |
                   %s
            """.formatted("-".repeat(35), "Title", getTitle(), "Author", getAuthor(),
                "ISBN", getIsbn(), "Price", getPrice(), "-".repeat(35));
    }
}

