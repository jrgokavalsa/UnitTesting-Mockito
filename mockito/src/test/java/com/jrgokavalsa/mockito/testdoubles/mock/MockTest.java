package com.jrgokavalsa.mockito.testdoubles.mock;


import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class MockTest {

    @Test
    public void testMock() {
    BookRepositoryMock bookRepository = new BookRepositoryMock();
        BookService bookService = new BookService(bookRepository);
        Book book1 = new Book("1234", "Mockito in Action", 500, LocalDateTime.now());
        Book book2 = new Book("1235", "Junit5 in Action", 400, LocalDateTime.now());
        bookService.addBook(book1);
        bookService.addBook(book2);
        bookRepository.verify(book2,2);

    }
}
