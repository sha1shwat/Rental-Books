package com.book.rental.bookrental.controller;

import com.book.rental.bookrental.model.Cart;
import com.book.rental.bookrental.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookrental")
public class CartController {

    @Autowired
    CartService cartService;

    @PostMapping("/cart/add")
    public ResponseEntity<String> bookAddToCart(@RequestBody Cart cart){

        return ResponseEntity.ok().body(cartService.addToCart(cart));

    }

    @PostMapping("/cart/delete")
    public ResponseEntity<String> bookDeleteFromCart(@RequestBody Cart cart){

        return ResponseEntity.ok().body(cartService.deleteFromCart(cart));

    }
}
