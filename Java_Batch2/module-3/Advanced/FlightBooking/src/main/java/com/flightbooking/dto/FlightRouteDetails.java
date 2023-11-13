package com.flightbooking.dto;

import com.flightbooking.model.Airline;
import com.flightbooking.model.Routes;

public class FlightRouteDetails {
	private Routes routes;
	private Airline airline;


	public FlightRouteDetails(Routes routes, Airline airline) {
		super();
		this.routes = routes;
		this.airline = airline;
	}
	public Routes getRoutes() {
		return routes;
	}
	public void setRoutes(Routes routes) {
		this.routes = routes;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}

}



