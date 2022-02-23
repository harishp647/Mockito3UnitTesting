package com.harish.mockito.test_doubles.stub;

import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

//    public void addBook(Book book)
//    {
//        bookRepository.addBook(book);
//    }
//    public int findAlltheBooks()
//    {
//        return bookRepository.findAll().size();
//    }

     public List<Book> getNewBooksWithApplieddiscount(int discountRate, int days)
     {
         List<Book> newBooks = bookRepository.findnewBooks(days);
         // 500 apply 10% -> 10% of 500 -> 50 -> 500 -50 -> 450

         for(Book book:newBooks)
         {   int price = book.getPrice();
             int newprice = price -((price*discountRate)/100);
             book.setPrice(newprice);
         }
        return newBooks;
     }
}
