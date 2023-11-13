package com.ust.foodorderingapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Menu {
	private long menuItemId;
	private String itemName;
	private ItemStatus status;
	private double price;
	private Category category;
	public enum ItemStatus{
		AVAILABLE,NOTAVAILABLE
	};
	public enum Category{
		VEG,NONVEG,SFS
	};
	

}
