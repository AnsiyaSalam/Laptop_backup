package com.ust.foodorderingapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ust.foodorderingapp.exception.DuplicateItemException;
import com.ust.foodorderingapp.exception.InvalidCategoryException;
import com.ust.foodorderingapp.exception.ItemNotFoundException;
import com.ust.foodorderingapp.model.Menu;
import com.ust.foodorderingapp.model.Menu.Category;

@Repository
public class MenuRepoImpl implements MenuRepo{
	
	List<Menu> menus = new ArrayList<>();
	

	@Override
	public Menu addItem(Menu menu) {
		// TODO Auto-generated method stub
		
		if(!menu.getCategory().equals(Category.NONVEG) && !menu.getCategory().equals(Category.VEG))
		{
			throw new InvalidCategoryException("Invalid Category");
		}
		for(Menu m : menus)
		{
			if(m.getMenuItemId()==menu.getMenuItemId())
			{
				throw new DuplicateItemException("Duplicate item found");
			}
		}
		menus.add(menu);
		return menu;
	}
	
	@Override
	public Menu getMenuById(long menuItemId) {
		// TODO Auto-generated method stub
	
		for(Menu m : menus)
		{
			if(m.getMenuItemId()==menuItemId)
			{
				return m;
			}
		}
		return null;
	}

	@Override
	public void deleteItem(long menuItemId) {
		// TODO Auto-generated method stub
		Menu m = getMenuById(menuItemId);
		menus.remove(m);
		
	}

	
	
//		long id = menu.getMenuItemId();
//		Menu oldItem = null;
//		for(Menu m : menus)
//		{
//			if(m.getMenuItemId()==id)
//			{
//				m.setPrice(menu.getPrice());
//				menus.add(m);
//				return m;
	
	public Menu updatePrice(long id, Menu menu) {
		// TODO Auto-generated method stub
		
		Menu oldItem = null;
		for(Menu m : menus)
		{
			if(m.getMenuItemId()==id)
			{
				oldItem = m;
				break;
			}
		}
		oldItem.setPrice(menu.getPrice());
		menus.add(oldItem);
		menus.remove(oldItem);
		return oldItem;
	}
		

	@Override
	public Menu getMenuByName(String itemName) {
		// TODO Auto-generated method stub
//		
//		Menu mi =menus.stream().filter( c -> c.getItemName().equalsIgnoreCase(itemName)).findFirst().
//				orElseThrow(() -> new ItemNotFoundException("item not found"));
//		return mi;
		
		for(Menu m : menus)
		{
			if(m.getItemName().equalsIgnoreCase(itemName))
			{
				return m;
			}
		}
		throw new ItemNotFoundException("item not found");
	}

	@Override
	public List<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		return menus;
	}

	
}

	


