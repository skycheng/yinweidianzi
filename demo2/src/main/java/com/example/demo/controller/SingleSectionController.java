package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingleSectionController {
	@Autowired
	private SingleSectionRepository repository;

	@GetMapping(value = "/findAllSingleSectionts")
	public List<SingleSection> findAllSingleSections() {

		return repository.findAll();

	}

	@GetMapping(value = "/findSingleSectionsByPartNumOrPackage/{p}")
	public List<SingleSection> findSingleSectionsByPartNumOrPackage(@PathVariable("p") String p) {

		return repository.findByPartNumOrPackage(p, p);

	}

}
