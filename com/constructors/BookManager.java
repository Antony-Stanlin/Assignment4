package com.constructors;

import com.classesAndObjects.BookDTO;

public class BookManager {

    private BookDTO[] books;
    private int count;

    public BookManager(int capacity) {
        books = new BookDTO[capacity];
        count = 0;
    }

    public void addBook(String title, String isbn, String author, String publisher, double price) {
        if (count < books.length) {
            books[count] = new BookDTO(title, isbn, author, publisher, price);
            count++;
        } 
        else {
            System.out.println("Cannot add more books. Array is full.");
        }
    }

    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books to display.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {
        BookManager manager = new BookManager(3);
        manager.addBook("Thinking, Fast and Slow", "978-0374533557", "Daniel Kahneman", "Farrar, Straus and Giroux", 550);
        manager.addBook("Man's Search for Meaning", "978-0807014271", "Viktor E. Frankl", "Beacon Press", 399);
        manager.addBook("The Science of Mind and Behavior", "978-0077136407", "Nigel Holt, Andy Bremner", "McGraw-Hill Education", 450);
        manager.displayBooks();
        System.out.println("\nTotal books added: " + BookDTO.getBookCount());
    }
}
