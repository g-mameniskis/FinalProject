package com.github.gmameniskis.EgglessYolk.services;

import com.github.gmameniskis.EgglessYolk.model.Book;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServices {

    private BookRepository bookRepository;

    @Autowired
    public BookServices(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(String bookTitle, String authorFirstName, String authorLastName) {
        List<Book> bookList = bookRepository.findBybookTitle(bookTitle);
        System.out.println("Book List: " + bookList);
        if (bookList.isEmpty()) {

        }
    }
}
