package com.harish.mockito.test_doubles.stub;

import java.util.Collection;
import java.util.List;

public interface BookRepository {
    List<Book> findnewBooks(int days);

//    void addBook(Book book);
//    Collection<Book> findAll();
}
