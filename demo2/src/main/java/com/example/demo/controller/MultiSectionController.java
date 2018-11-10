package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiSectionController {
	@Autowired
	private MultiSectionRepository repository;

	@GetMapping(value = "/findAllMultiSections")
	public List<Multisection> findAllMultiSections() {

		return repository.findAll();

	}

	@PostMapping(value = "/findMultiSectionsByPartNumOrPackage")
	public List<Multisection> findMultiSectionsByPartNumOrPackage(@RequestParam("p") String p) {
		if(p == null || p.trim().length() == 0){
			return repository.findAll();
		}
		return repository.findByPartNumOrPackage(p, p);

	}

}
