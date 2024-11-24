package com.packages.library;

import com.packages.library.books.Book;
import com.packages.library.members.Member;
import com.packages.library.transactions.Transaction;

public class LibrarySystem {
    public static void main(String[] args) {
        Member member = new Member("John Doe", (byte) 25);
        Book book = new Book("Java Programming", "1234567890", "Author Name", "Publisher Name", 29.99);
        
        Transaction txn = new Transaction(member, book, "Checkout");
        System.out.println(txn);
    }
}
