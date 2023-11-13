package com.ust.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.ust.bookstore.model.Book;
import com.ust.bookstore.service.BookStoreService;

@RestController
@RequestMapping("/api/book")
public class BookStoreController {
	
	@Autowired
	private BookStoreService service;
	
	
	@PostMapping
	public Book addBook(@RequestBody Book book)
	{
		return service.addBook(book);
	}
	
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable int id)
	{
		return service.getBookById(id);
	}
	
	
	@GetMapping
	public List<Book> getAllBook()
	{
		return service.getAllBook();
	}
	
	@PutMapping("/{id}")
	public Book updateBook(@PathVariable int id, @RequestBody Book book)
	{
		return service.updateBookById(id, book);
	}
	
	
	@DeleteMapping("/{id}")

	public void deleteBook(@PathVariable int id)
	{
		service.deleteBookById(id);
	}

}
