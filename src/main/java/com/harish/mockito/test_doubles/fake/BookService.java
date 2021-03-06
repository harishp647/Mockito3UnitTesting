package com.harish.mockito.test_doubles.fake;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book)
    {
        bookRepository.saveBook(book);
    }

    public int findNumberOfBooks()
    {
       return bookRepository.findAllBooks().size();
    }
}
