package com.harish.mockito.test_doubles.fake;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FakeTest {
    @Test
    public void testFake()
    {
        BookRepository bookRepository = new FakeBookRepository() ;
        BookService bookService = new BookService(bookRepository);

        bookService.addBook(new Book("1234","MockitoInAction",250, LocalDate.now()));
        bookService.addBook(new Book("12345","Junit5InAction",200,LocalDate.now()));

        assertEquals(2,bookService.findNumberOfBooks());
    }
}
