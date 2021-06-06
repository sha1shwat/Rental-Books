package com.book.rental.bookrental.service;

import com.book.rental.bookrental.model.User;
import com.book.rental.bookrental.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String createUser(User user){

        Optional<User> getUser = userRepository.findByUserName(user.getUserName());

        if (getUser.isPresent()){

            return "Already Present";
        }

        userRepository.save(user);
        return "User created successfully";

    }
}
