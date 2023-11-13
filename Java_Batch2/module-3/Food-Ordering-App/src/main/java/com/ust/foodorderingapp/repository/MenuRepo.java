package com.ust.foodorderingapp.repository;

import java.util.List;

import com.ust.foodorderingapp.model.Menu;

public interface MenuRepo {
	
	public Menu addItem(Menu menu);
	public Menu getMenuById(long menuItemId);
	public void deleteItem(long menuItemId);
	public Menu updatePrice(long menuItemId,Menu menu);
	public Menu getMenuByName(String itemName);
	public List<Menu> getAllMenu();

}




