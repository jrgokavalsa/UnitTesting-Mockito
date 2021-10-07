package com.jrgokavalsa.mockito.testdoubles.stub;

import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getNewBooksWithAppliedDiscount(int discountRate, int days) {
        List<Book>newBooks= bookRepository
                .findNewBooks(days)
                .parallelStream()
                .peek(foo -> foo.setPrice(foo.getPrice()-(foo.getPrice() * discountRate / 100)))
                .collect(Collectors.toList());
        for (Book book : newBooks) {
            System.out.println(book.getPrice());
        }
        return newBooks;

    }


}

