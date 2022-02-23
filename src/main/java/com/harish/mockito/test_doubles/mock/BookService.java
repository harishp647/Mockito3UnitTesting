package com.harish.mockito.test_doubles.mock;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void saveBook(Book book)
    {
        if(book.getPrice()>400)
        {
            return;
        }
        else {
            bookRepository.saveBook(book);
        }
    }
}
