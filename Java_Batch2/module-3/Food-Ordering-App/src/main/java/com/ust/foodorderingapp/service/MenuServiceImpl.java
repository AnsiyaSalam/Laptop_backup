package com.ust.foodorderingapp.service;

import java.awt.MenuItem;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.foodorderingapp.model.Menu;
import com.ust.foodorderingapp.model.Menu.Category;
import com.ust.foodorderingapp.model.Menu.ItemStatus;
import com.ust.foodorderingapp.repository.MenuRepo;

@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private MenuRepo repo;
	
	@PostConstruct
    public void initSomeItem()
    {
		
		Menu c1=new Menu(1001,"Appam",ItemStatus.AVAILABLE,123,Category.VEG);
		Menu c2=new Menu(1002,"Beef",ItemStatus.AVAILABLE,225,Category.NONVEG);
        Menu c3=new Menu(1003,"Kappa",ItemStatus.AVAILABLE,90,Category.VEG);

        repo.addItem(c1);
        repo.addItem(c2);
        repo.addItem(c3);
        
    }
	

	@Override
	public Menu addItem(Menu menu) {
		// TODO Auto-generated method stub
		return repo.addItem(menu);
	}

	@Override
	public Menu getMenuById(long menuItemId) {
		// TODO Auto-generated method stub
		return repo.getMenuById(menuItemId);
	}

	@Override
	public void deleteItem(long menuItemId) {
		// TODO Auto-generated method stub
		repo.deleteItem(menuItemId);
		
	}

	public Menu updatePrice(long menuItemId,Menu menu) {
		// TODO Auto-generated method stub
		return repo.updatePrice(menuItemId,menu);
	}

	@Override
	public Menu getMenuByName(String itemName) {
		// TODO Auto-generated method stub
		return repo.getMenuByName(itemName);
	}

	@Override
	public List<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		return repo.getAllMenu();
	}




}
