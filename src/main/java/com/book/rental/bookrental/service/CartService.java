package com.book.rental.bookrental.service;

import com.book.rental.bookrental.model.Book;
import com.book.rental.bookrental.model.Cart;
import com.book.rental.bookrental.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    BookService bookService;

    @Autowired
    CartRepository cartRepository;

    public String addToCart(Cart cart){

        Book book = bookService.getBook(cart.getBookName());
        if (book == null){
            return "Book isn't present";
        }
        bookService.deleteBook(book);
        cartRepository.save(cart);
        return "Book is successfully added to cart";
    }

    public String deleteFromCart(Cart cart){


        int count = cartRepository.deleteByBookNameAndUserId(cart.getBookName(),cart.getUserId());
        if (count>1) {
            Book book = new Book();
            book.setTitle(cart.getBookName());
            bookService.addBook(book);
            return "Successfully removed from cart";
        }
        return "Book isn't present in cart";

    }
}
