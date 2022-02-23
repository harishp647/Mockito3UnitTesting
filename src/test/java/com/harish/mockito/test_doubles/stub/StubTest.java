package com.harish.mockito.test_doubles.stub;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StubTest {
    @Test
    public void demoStub()
    {
        BookRepository bookRepository = new TestStubBookRepository();
        BookService bookservice = new BookService(bookRepository);

        List<Book> newBookwithAppliedDiscount = bookservice.getNewBooksWithApplieddiscount(10,7);
        assertEquals(2,newBookwithAppliedDiscount.size());
        assertEquals(450,newBookwithAppliedDiscount.get(0).getPrice());
        assertEquals(360,newBookwithAppliedDiscount.get(1).getPrice());
    }
}
