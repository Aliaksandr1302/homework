package com.alex.librarian.entry;

import com.alex.librarian.entity.Book;
import com.alex.librarian.library.Librarian;
import com.alex.librarian.library.Library;

import java.text.ParseException;

public class LibManager {
    public static void main(String[] args) {
        Library library = new Library();
        Librarian librarian = new Librarian(library);

        try {
            librarian.addBook(new Book("QQWE", "Ekkel", "02.12.2001"));
            librarian.addBook(new Book("QqwdqwQWE", "Ekkel", "02.12.2004"));
            librarian.addBook(new Book("QqwdqE", "Ekkel", "02.12.1800"));
            librarian.addBook(new Book("dwq", "Ekkel", "02.12.2050"));
            librarian.addBook(new Book("dwq", "Dostoewsky", "02.12.1900"));
            librarian.addBook(new Book("dwq", "HelloWorld", "02.12.1920"));
            System.out.println(library.viewAllBooks());
            System.out.println(library.find(new Book("QQWE", "Ekkel", "02.12.2001")));
            System.out.println(library.getByAuthor("Ekkel"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
