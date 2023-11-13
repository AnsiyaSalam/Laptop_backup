package com.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.server.model.Server;

@Repository
public interface ServerRepo extends JpaRepository<Server, Integer> {

}
