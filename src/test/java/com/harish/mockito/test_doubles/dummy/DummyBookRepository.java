package com.harish.mockito.test_doubles.dummy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DummyBookRepository implements BookRepoistory{

    //In memory dataBases, HashMap, List
    Map<String, Book> bookStore = new HashMap<>();
    @Override
    public void addBook(Book book) {
        bookStore.put(book.getBookId(),book);
    }

    @Override
    public Collection<Book> findAllbooks() {
        return bookStore.values();
    }
}
