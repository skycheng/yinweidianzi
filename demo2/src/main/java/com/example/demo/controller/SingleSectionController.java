package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingleSectionController {
	@Autowired
	private SingleSectionRepository repository;

	@GetMapping(value = "/findAllSingleSectionts")
	public List<SingleSection> findAllSingleSections() {

		return repository.findAll();

	}

	@PostMapping(value = "/findSingleSectionsByPartNumOrPackage")
	public List<SingleSection> findSingleSectionsByPartNumOrPackage(@RequestParam("p") String p) {

		if (p == null || p.trim().length() == 0) {
			return repository.findAll();
		}
		return repository.findByPartNumOrPackage(p, p);

	}

}
