package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MosfetController {
	@Autowired
	private MosfetRepository repository;
	
	@GetMapping(value = "/findAllMosfets")
	public List<Mosfet> findAllMosfets(){
		
		
		return repository.findAll();
		
	}
	
	
	
	
	
	
	@GetMapping(value = "/findByPartNumOrPackage/{p}")
	public List<Mosfet> findByPartNumOrPackage(@PathVariable("p") String p){
		
		return repository.findByPartNumOrPackage(p,p);
		
	}


}
