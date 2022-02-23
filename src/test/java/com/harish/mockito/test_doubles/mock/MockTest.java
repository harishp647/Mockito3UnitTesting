package com.harish.mockito.test_doubles.mock;

import com.harish.mockito.test_doubles.mock.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class MockTest {
    @Test
    public void MockDemo()
    {
        MockRepository mockRepo = new MockRepository();
        BookService bookService = new BookService(mockRepo);

       Book book1 = new Book("1234","MockitoInAction",500, LocalDate.now());
       Book book2 = new Book("12345","JUnit5InAction",400, LocalDate.now());

        bookService.saveBook(book1); //return
        bookService.saveBook(book2); // save called

        mockRepo.verify(book2,1);

    }
}
