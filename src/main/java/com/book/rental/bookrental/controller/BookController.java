package com.book.rental.bookrental.controller;

import com.book.rental.bookrental.model.Book;
import com.book.rental.bookrental.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookrental")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/book")
    public ResponseEntity<String> bookAddition(@RequestBody Book book){

        return ResponseEntity.ok().body(bookService.addBook(book));
    }
}
