package com.example.demo.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StarRepository extends JpaRepository<Star, Integer> {
	
	@Query(value = "select * from star where xinghao like %?1% ", nativeQuery = true)
    List<Ciji> findByPartNumOrPackage(String partNum);

}

