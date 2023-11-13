package com.ust.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.bookstore.model.Book;

@Repository
public interface BookStoreRepo extends JpaRepository<Book,Integer>{

}
