package com.ust.bookstore.service;

import java.util.List;

import com.ust.bookstore.model.Book;

public interface BookStoreService {
	
	public Book addBook(Book book);
    public Book getBookById(int id);
    public List<Book> getAllBook();
    public Book updateBookById(int id,Book book);
    public void deleteBookById(int id);
	
}
