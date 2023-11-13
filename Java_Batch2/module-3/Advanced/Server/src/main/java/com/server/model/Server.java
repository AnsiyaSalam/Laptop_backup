package com.server.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Server {
	
	@Id
	private int id;
	private String name;
	
	public Server() {
	
		// TODO Auto-generated constructor stub
	}

	public Server(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
