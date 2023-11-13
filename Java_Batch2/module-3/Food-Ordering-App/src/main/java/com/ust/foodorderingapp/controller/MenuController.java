package com.ust.foodorderingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ust.foodorderingapp.model.Menu;
import com.ust.foodorderingapp.service.MenuService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/menu")
public class MenuController {
	
	@Autowired
	private MenuService service;
	
	@ResponseStatus(code=HttpStatus.CREATED)
	@PostMapping
	public Menu addItem(@RequestBody Menu menu)
	{
		return service.addItem(menu);
	}
	
	@GetMapping("/{menuItemId}")
	public Menu getMenuById(@PathVariable long menuItemId)
	{
		return service.getMenuById(menuItemId);
	}
	
	@DeleteMapping("/{menuItemId}")
	@ResponseStatus(code=HttpStatus.OK)
	public void deleteItem(@PathVariable long menuItemId)
	{
		service.deleteItem(menuItemId);
	}
	
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	@PutMapping("/{id}")
	public Menu updatePrice(@PathVariable long id,@RequestBody Menu menu)
	{
		return service.updatePrice(id,menu);
	}
	
	@GetMapping("/name/{name}")
	public Menu getMenuByName(@PathVariable String name)
	{
		return service.getMenuByName(name);
	}
	
	@ResponseStatus(code=HttpStatus.OK)
	@GetMapping
	public List<Menu> getAllMenu()
	{
		return service.getAllMenu();
	}

}
