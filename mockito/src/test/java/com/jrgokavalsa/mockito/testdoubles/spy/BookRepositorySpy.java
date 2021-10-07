package com.jrgokavalsa.mockito.testdoubles.spy;

public class BookRepositorySpy implements BookRepository {
    int saveCalled =0;
    Book lastAddedBook = null;
    @Override
    public void save(Book book) {
        saveCalled++;
        lastAddedBook=book;
    }

    public int timesCalled(){
        return this.saveCalled;
    }

    public boolean calledWith(Book book){
        return lastAddedBook.equals(book);
    }
}
