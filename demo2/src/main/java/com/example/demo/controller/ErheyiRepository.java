package com.example.demo.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ErheyiRepository extends JpaRepository<Erheyi, Integer> {

	@Query(value = "select * from erheyi where a like %?1% or b like %?2%", nativeQuery = true)
	List<Erheyi> findErheyisByPartNumOrPackage(String partNum, String package2);

}
