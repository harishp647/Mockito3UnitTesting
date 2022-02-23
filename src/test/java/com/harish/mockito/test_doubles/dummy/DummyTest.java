package com.harish.mockito.test_doubles.dummy;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTest {

    @Test
    public void testDummy()
    {
        BookRepoistory bookRepoistory = new DummyBookRepository();
        EmailService emailservice = new DummyEmail();
        BookService bookService = new BookService(bookRepoistory,emailservice);

        bookService.addBooks(new Book("1234","MockitoInAction",250, LocalDate.now()));
        bookService.addBooks(new Book("12345","Junit5InAction",200,LocalDate.now()));

        assertEquals(2,bookService.findAllBooks());
    }



}
