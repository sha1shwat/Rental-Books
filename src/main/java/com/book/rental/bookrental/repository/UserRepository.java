package com.book.rental.bookrental.repository;

import com.book.rental.bookrental.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

  //  @Query("select u from user u where u.userName =:n")
    public Optional<User> findByUserName(String userName);
}
