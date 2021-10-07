package com.jrgokavalsa.mockito.testdoubles.stub;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StubTest {

    @Test
    public void testStub() {
        BookRepository bookRepository = new BookRepositoryStub();
        BookService bookService = new BookService(bookRepository);
        List<Book> newBooks = bookService.getNewBooksWithAppliedDiscount(10, 7);
        assertEquals(2,newBooks.size());
        assertEquals(450,newBooks.get(0).getPrice());
        assertEquals(360,newBooks.get(1).getPrice());
    }
}
