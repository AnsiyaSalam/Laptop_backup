package com.stackroute.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.domain.Blog;
import com.stackroute.service.BlogService;

/* Add annotation to declare this class as REST Controller */

@RestController
@RequestMapping("/api/v1/")
public class BlogController {

    /* Provide implementation code for these methods */

    /*This method should save blog and return savedBlog Object */
	
	@Autowired
	private BlogService service;
	
	@PostMapping("/blog")
    public ResponseEntity<Blog> saveBlog(@RequestBody Blog blog) {
        return new ResponseEntity<>(this.service.saveBlog(blog), HttpStatus.CREATED);
    }

    /*This method should fetch all blogs and return the list of all blogs */
	
	@GetMapping("/blogs")
    public ResponseEntity<List<Blog>> getAllBlogs() {
        return new ResponseEntity<List<Blog>>(this.service.getAllBlogs(), HttpStatus.OK);
    }

    /*This method should fetch the blog taking its id and return the respective blog */
	
	@GetMapping("/blog/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable int id){
        return new ResponseEntity<>(this.service.getBlogById(id), HttpStatus.FOUND);
    }

    /*This method should delete the blog taking its id and return the deleted blog */
	
	@DeleteMapping("/blog/{id}")
    public ResponseEntity<Blog> getBlogAfterDeleting(@PathVariable int id) {
        return new ResponseEntity<>(this.service.deleteBlog(id), HttpStatus.OK);
    }

    /*This method should update blog and return the updatedBlog */
	
	@PutMapping("/blog")
    public ResponseEntity<Blog> updateBlog(@RequestBody Blog blog) {
        return new ResponseEntity<>(this.service.updateBlog(blog), HttpStatus.OK);
    }
}