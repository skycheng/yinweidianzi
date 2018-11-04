package com.example.demo.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GirlRepository extends JpaRepository<Girl, Integer> {
	
	@Query(value = "select * from girl where age > ?1", nativeQuery = true)
    List<Girl> findByAgeLarge(Integer age);

}
