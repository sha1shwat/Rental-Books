package com.book.rental.bookrental.service;

import com.book.rental.bookrental.model.Book;
import com.book.rental.bookrental.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public String addBook(Book book){

        Optional<Book> bookFromDb = bookRepository.findByTitle(book.getTitle());

        if (bookFromDb.isPresent()){

            int bookCount = bookFromDb.get().getCount()+1;
            bookFromDb.get().setCount(bookCount);
            bookRepository.save(bookFromDb.get());

            return "Book's count is incremented";

        }
        book.setCount(1);
        bookRepository.save(book);
        return "Book is successfully added";


    }

    public boolean deleteBook(Book book){

        Optional<Book> bookFromDb = bookRepository.findByTitle(book.getTitle());

        if (bookFromDb.isPresent()){

            int bookCount = bookFromDb.get().getCount();
            if (bookCount >0) {
                bookCount-=1;
                bookFromDb.get().setCount(bookCount);
                bookRepository.save(bookFromDb.get());
                return true;
            }

        }

        return false;
    }

    protected Book getBook(String title){

        Optional<Book> bookInDb = bookRepository.findByTitle(title);
        return bookInDb.orElse(null);

    }
}
