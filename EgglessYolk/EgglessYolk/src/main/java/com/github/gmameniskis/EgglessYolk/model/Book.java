package com.github.gmameniskis.EgglessYolk.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    private final String ISBN;
    private String bookTitle;
    private String authorFirstName;
    private String authorLastName;

    public Book(String ISBN, String bookTitle, String authorFirstName, String authorLastName) {
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", authorFirstName='" + authorFirstName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                '}';
    }

    public String getISBN() {
        return ISBN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }
}
