package com.sample.controller;

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

import com.sample.model.Sample;
import com.sample.repository.SampleRepo;

@RestController
public class SampleController {
	
	@Autowired
	private SampleRepo repo;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Sample>> getAll()
	{
		return ResponseEntity.ok().body(repo.findAll());
	}
	
	@PostMapping("/create")
	public ResponseEntity<Sample> create(@RequestBody Sample data)
	{
		return ResponseEntity.ok().body(repo.save(data));	
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Sample> getById(@PathVariable int id)
	{
		return ResponseEntity.ok().body(repo.findById(id).get());
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Sample> update(@RequestBody Sample data,@PathVariable int id)
	{
		Optional<Sample> s = repo.findById(id);
		if(s.isEmpty())
		{
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok().body(repo.save(data));
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable int id)
	{
		Optional<Sample> s = repo.findById(id);
		repo.delete(s.get());
		return ResponseEntity.ok().body("successfully deleted");
	}
	

}
