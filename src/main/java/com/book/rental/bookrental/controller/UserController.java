package com.book.rental.bookrental.controller;

import com.book.rental.bookrental.model.User;
import com.book.rental.bookrental.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookrental")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String> userCreation(@RequestBody User user){

        return ResponseEntity.ok().body(userService.createUser(user));

    }
}
