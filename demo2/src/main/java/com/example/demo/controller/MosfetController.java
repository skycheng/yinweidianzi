package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MosfetController {
	@Autowired
	private MosfetRepository repository;

	@GetMapping(value = "/findAllMosfets")
	public List<Mosfet> findAllMosfets() {

		return repository.findAll();

	}

	@PostMapping(value = "/findByPartNumOrPackage")
	public List<Mosfet> findByPartNumOrPackage(@RequestParam("p") String p) {
		if (p == null || p.trim().length() == 0) {
			return repository.findAll();
		}
		return repository.findByPartNumOrPackage(p, p);

	}

}
