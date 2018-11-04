package com.example.demo.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SingleSectionRepository extends JpaRepository<SingleSection, Integer> {
	
	@Query(value = "select * from single_section where partnum like %?1% or package2 like %?2%", nativeQuery = true)
    List<SingleSection> findByPartNumOrPackage(String partNum,String package2);

}

