package com.ust.bookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="book_store")
public class Book {
	
	@Id
	private int id;
	@Column(nullable=false)
	private String title;
	@Column(length=200)
	private String author;
	private int isbn;
	private int pubYear;
	private float price;
}