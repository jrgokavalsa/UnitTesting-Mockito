package com.jrgokavalsa.mockito.testdoubles.fake;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

public class FakeTest {

    @Test
    public void testFake(){
        BookRepository bookRepository = new FakeBookRepository();
        BookService bookService = new BookService(bookRepository);

        bookService.addBook(new Book("1234","Mockito in Action",250, LocalDateTime.now()));
        bookService.addBook(new Book("1235","Junit in Action",350, LocalDateTime.now()));

        assertEquals(2,bookService.findNumberOfBooks());
    }
}
