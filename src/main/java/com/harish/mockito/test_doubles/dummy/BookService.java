package com.harish.mockito.test_doubles.dummy;

public class BookService {

   private BookRepoistory bookrepository;
   private EmailService email;

    public BookService(BookRepoistory bookrepository, EmailService email) {
        this.bookrepository = bookrepository;
        this.email = email;
    }

    public void addBooks(Book book)
    {
        bookrepository.addBook(book);
    }

    public int findAllBooks()
    {
        return bookrepository.findAllbooks().size();
    }
}
