package com.book.rental.bookrental.repository;

import com.book.rental.bookrental.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookRepository extends CrudRepository<Book,Integer> {

    Optional<Book> findByTitle(String title);
}
