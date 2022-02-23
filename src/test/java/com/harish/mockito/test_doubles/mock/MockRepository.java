package com.harish.mockito.test_doubles.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MockRepository implements BookRepository {

    int saveCalled = 0;
    Book lastSaved = null;
    @Override
    public void saveBook(Book book) {
        saveCalled++;
        lastSaved = book;
    }

    public void verify(Book book,int times)
    {
        assertEquals(times,saveCalled);
        assertEquals(book,lastSaved);
    }
}
