package com.bookstoreapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;


// @Data
// @AllArgsConstructor
// @NoArgsConstructor
@Entity
@Table(name="book_store")
public class Book {

    @Id
    private int id;

    @NotBlank(message = "Title cannot be found")
    @Size(max=100, message = "Title name should not exceed 100 characters")
    private String title;

    @NotBlank(message = "Author name cannot be empty")
    @Size(max=200, message = "Author name should not exceed 200 charcters")
    private String author;
   
    private int publicationYear;
 
    private long isbn;
   
    @Positive(message = "The should be a positive decimal value")
    @DecimalMin(value="0.01", message = "Price must be a positive decimal value")
    private double price;


    public Book() {

    }


    public Book(int id,
            String title,
            String author,
            int publicationYear, 
            long isbn,
            double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
