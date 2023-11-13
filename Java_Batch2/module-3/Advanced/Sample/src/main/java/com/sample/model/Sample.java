package com.sample.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sample {
	
	@Id
	private int id;
	private String name;
	private String job;
	
	public Sample() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sample(int id, String name, String job) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
	
	

}
