package com.jrgokavalsa.mockito.testdoubles.dummy;


import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTest {

    @Test
    public void testDummy(){
       BookRepository bookRepository = new FakeBookRepository();
       EmailService emailService = new DummyEmailService();
       BookService bookService = new BookService(bookRepository,emailService);

        bookService.addBook(new Book("1234","Mockito in Action",250, LocalDateTime.now()));
        bookService.addBook(new Book("1235","Junit in Action",350, LocalDateTime.now()));

        assertEquals(2,bookService.findNumberOfBooks());
    }
}
