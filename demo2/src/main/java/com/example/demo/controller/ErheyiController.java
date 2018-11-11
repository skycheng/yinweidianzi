package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErheyiController {
	@Autowired
	private ErheyiRepository repository;

	@GetMapping(value = "/findAllErheyis")
	public List<Erheyi> findAllMosfets() {

		return repository.findAll();

	}

	@PostMapping(value = "/findErheyisByPartNumOrPackage")
	public List<Erheyi> findErheyisByPartNumOrPackage(@RequestParam("p") String p) {
		if (p == null || p.trim().length() == 0) {
			return repository.findAll();
		}
		return repository.findErheyisByPartNumOrPackage(p, p);

	}

}
