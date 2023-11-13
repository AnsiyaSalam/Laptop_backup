package com.ansiya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ansiya.model.Ansiya;

@Repository
public interface AnsiRepo extends JpaRepository<Ansiya, Integer> {

}
