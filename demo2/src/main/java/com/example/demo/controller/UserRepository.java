package com.example.demo.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query(value = "select * from user where name = ?1 and password = ?2", nativeQuery = true)
    List<User> findUser(String name,String password);

}

