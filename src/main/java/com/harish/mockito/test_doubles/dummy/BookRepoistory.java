package com.harish.mockito.test_doubles.dummy;

import java.util.Collection;

public interface BookRepoistory {

    void addBook(Book book);
    public Collection<Book> findAllbooks();
}
