package com.flightbooking.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flightbooking.model.Airports;

public interface AirportRepo extends JpaRepository<Airports,String> {
	@Query(value = "select * from airports where code = :code",nativeQuery = true)
	Optional<Airports> getAirportByCode(String code);

	@Query(value = "from Airports where city like :starting% or code like :starting%")
    public Optional<List<Airports>> getAirportSuggestions(@Param("starting") String starting);
}
