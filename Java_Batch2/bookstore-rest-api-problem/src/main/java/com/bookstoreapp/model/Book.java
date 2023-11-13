package com.bookstoreapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

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


   
}
