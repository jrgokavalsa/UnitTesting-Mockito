package com.jrgokavalsa.mockito.testdoubles.stub;

import java.util.List;

public interface BookRepository {

    List<Book> findNewBooks(int days);
}
