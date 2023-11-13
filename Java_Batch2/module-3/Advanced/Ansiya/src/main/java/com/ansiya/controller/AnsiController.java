package com.ansiya.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ansiya.model.Ansiya;
import com.ansiya.repository.AnsiRepo;

@RestController
public class AnsiController {
	
	@Autowired
	private AnsiRepo repo;
	
	@GetMapping("/getall")
	public ResponseEntity<List<Ansiya>> getAll()
	{
		return ResponseEntity.ok().body(repo.findAll());
	}
	
	@PostMapping("/create")
	public ResponseEntity<Ansiya> create(@RequestBody Ansiya ansi)
	{
		return ResponseEntity.ok().body(repo.save(ansi));
	}

	@GetMapping("/findById/{id}")
	public ResponseEntity<Ansiya> findById(@PathVariable int id)
	{
		return ResponseEntity.ok().body(repo.findById(id).get());
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Ansiya> update(@RequestBody Ansiya ansi, @PathVariable int id)
	{
		Optional<Ansiya> ans=repo.findById(id);
		if(ans.isEmpty())
		{
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok().body(repo.save(ansi));
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable int id)
	{
		Optional<Ansiya> ans=repo.findById(id);
		repo.delete(ans.get());
		return ResponseEntity.ok().body("deleted successfully");
		
	}
}
