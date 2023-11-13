package com.ansiya.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ansiya {
	
	@Id
	private int id;
	private String name;
	private String job;
	private String married;
	
	public Ansiya() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ansiya(int id, String name, String job, String married) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.married = married;
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

	public String getMarried() {
		return married;
	}

	public void setMarried(String married) {
		this.married = married;
	}
	
	

}
