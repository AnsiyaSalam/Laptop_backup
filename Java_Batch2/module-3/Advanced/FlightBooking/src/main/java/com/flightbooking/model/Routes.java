package com.flightbooking.model;

import java.time.LocalDateTime;
import java.util.Map;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

 

@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Routes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@JsonProperty("iata_from")
	private String iataFrom;

	@JsonProperty("iata_to")
	private String iataTo;
	
	private String airLineIata;

	@JsonProperty("airline") // Use this annotation to specify the JSON field name
    private void unpackNestedIATA(Map<String, Object> airline) {
        this.airLineIata = (String) airline.get("IATA");
    }

	@JsonProperty("airportVia")
	private String airportVia;

	@JsonProperty("class_business")
	private boolean classBusiness;

	@JsonProperty("class_economy")
	private boolean classEconomy;

	@JsonProperty("class_first")
	private boolean classFirst;

	@JsonProperty("day1")
	private String day1;

	@JsonProperty("day2")
	private String day2;

	@JsonProperty("day3")
	 private String day3;

	@JsonProperty("day4")
	private String day4;

	@JsonProperty("day5")
	private String day5;

	@JsonProperty("day6")
	private String day6;

	@JsonProperty("day7")
	private String day7;

	@JsonProperty("max_duration")
	private int maxDuration;

	@JsonProperty("min_duration")
	private int minDuration;

	@Column(name = "created_on", columnDefinition = "TIMESTAMP")
	private LocalDateTime createdOn;

	@Column(name = "updated_on", columnDefinition = "TIMESTAMP")
	private LocalDateTime updatedOn;

	@PrePersist
	protected void onCreate() {
		createdOn = LocalDateTime.now();
	}

	@PreUpdate
	protected void onUpdate() {
		updatedOn = LocalDateTime.now();
	}


}
