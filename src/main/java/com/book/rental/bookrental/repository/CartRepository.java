package com.book.rental.bookrental.repository;

import com.book.rental.bookrental.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CartRepository extends CrudRepository<Cart,Integer> {


    int deleteByBookNameAndUserId(String bookName, String userId);
}
