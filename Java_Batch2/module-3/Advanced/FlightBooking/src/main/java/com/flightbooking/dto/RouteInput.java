package com.flightbooking.dto;

import java.time.LocalDate;

public class RouteInput {
	
	private LocalDate date;
	private String destination;
	private String arrival;
	
	public RouteInput(LocalDate date, String destination, String arrival) {
		super();
		this.date = date;
		this.destination = destination;
		this.arrival = arrival;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getArrival() {
		return arrival;
	}
	
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

}
