package com.example.demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StarRepository extends JpaRepository<Star, Integer> {
	
	@Query(value = "select top 1 * from star order by id desc ", nativeQuery = true)
	Star findTop1();

}

