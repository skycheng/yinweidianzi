package com.example.demo.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MosfetRepository extends JpaRepository<Mosfet, Integer> {
	
	@Query(value = "select * from mosfet where part_num like %?1% or package2 like %?2%", nativeQuery = true)
    List<Mosfet> findByPartNumOrPackage(String partNum,String package2);

}

