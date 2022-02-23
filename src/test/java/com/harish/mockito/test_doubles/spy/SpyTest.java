package com.harish.mockito.test_doubles.spy;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpyTest {
    @Test
    public void demoSpy()
    {
        SpyBookRepository bookSpyRepository = new SpyBookRepository();
        BookService bookService = new BookService(bookSpyRepository);

        Book book1 = new Book("1234","MockitoInAction",500, LocalDate.now());
        Book book2 = new Book("12345","JUnit5InAction",400, LocalDate.now());

        bookService.saveBook(book1);
        bookService.saveBook(book2);

        assertEquals(2,bookSpyRepository.savetimesCalled());
        assertEquals(true,bookSpyRepository.calledWith(book2));
    }
}
