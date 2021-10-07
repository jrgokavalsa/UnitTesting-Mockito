package com.jrgokavalsa.mockito.testdoubles.spy;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpyTest {

    @Test
    public void testSpy() {
        BookRepositorySpy bookRepository = new BookRepositorySpy();
        BookService bookService = new BookService(bookRepository);
        Book book1 = new Book("1234", "Mockito in Action", 500, LocalDateTime.now());
        Book book2 = new Book("1235", "Junit5 in Action", 400, LocalDateTime.now());
        bookService.addBook(book1);
        bookService.addBook(book2);
        assertEquals(2,bookRepository.timesCalled());
        assertTrue(bookRepository.calledWith(book2));
    }
}
