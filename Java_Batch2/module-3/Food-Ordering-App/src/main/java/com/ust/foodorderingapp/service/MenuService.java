package com.ust.foodorderingapp.service;

import java.util.List;

import com.ust.foodorderingapp.model.Menu;

public interface MenuService {
	
	public Menu addItem(Menu menu);
	public Menu getMenuById(long menuItemId);
	public void deleteItem(long menuItemId);
	public Menu getMenuByName(String itemName);
	public List<Menu> getAllMenu();
	Menu updatePrice(long menuItemId, Menu menu);

}
