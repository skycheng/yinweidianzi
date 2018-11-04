package com.example.demo.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MultiSectionRepository extends JpaRepository<Multisection, Integer> {
	
	@Query(value = "select * from multisection where partnum like %?1% or package2 like %?2%", nativeQuery = true)
    List<Multisection> findByPartNumOrPackage(String partNum,String package2);

}

