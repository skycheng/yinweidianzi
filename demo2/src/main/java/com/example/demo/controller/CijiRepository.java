package com.example.demo.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CijiRepository extends JpaRepository<Ciji, Integer> {
	
	@Query(value = "select * from ciji where xinghao like %?1% ", nativeQuery = true)
    List<Ciji> findByPartNumOrPackage(String partNum);

}

