package com.harish.mockito.test_doubles.spy;

public class SpyBookRepository implements BookRepository {

    int saveCalled = 0;
    Book lastSavedBook = null;
    @Override
    public void saveBook(Book book) {
        saveCalled++;
        lastSavedBook = book;
    }

    public int savetimesCalled()
    {
        return saveCalled;
    }

    public boolean calledWith(Book book)
    {
        return lastSavedBook.equals(book);
    }
}
