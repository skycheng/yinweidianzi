package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiSectionController {
	@Autowired
	private MultiSectionRepository repository;

	@GetMapping(value = "/findAllMultiSections")
	public List<Multisection> findAllMultiSections() {

		return repository.findAll();

	}

	@GetMapping(value = "/findMultiSectionsByPartNumOrPackage/{p}")
	public List<Multisection> findMultiSectionsByPartNumOrPackage(@PathVariable("p") String p) {

		return repository.findByPartNumOrPackage(p, p);

	}

}
