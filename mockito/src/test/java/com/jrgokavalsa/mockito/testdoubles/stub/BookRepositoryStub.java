package com.jrgokavalsa.mockito.testdoubles.stub;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BookRepositoryStub implements BookRepository {
    @Override
    public List<Book> findNewBooks(int days) {
        List<Book>newBooks= new ArrayList<>();
        Book book1= new Book("1234","Mockito in Action",500, LocalDateTime.now());
        Book book2 = new Book("1235","Junit5 in Action",400, LocalDateTime.now());
        newBooks.add(book1);
        newBooks.add(book2);
        return newBooks;
    }
}
