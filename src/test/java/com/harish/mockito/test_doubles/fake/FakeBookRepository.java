package com.harish.mockito.test_doubles.fake;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements BookRepository{
    //In memory dataBases, HashMap, List
    Map<String,Book> bookStore = new HashMap<>();
    @Override
    public void saveBook(Book book) {
        bookStore.put(book.getBookId(),book);
    }

    @Override
    public Collection<Book> findAllBooks() {
        return bookStore.values();
    }
}
