package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StarController {
	@Autowired
	private StarRepository repository;

	@ResponseBody
	@GetMapping(value = "/findAllStars")
	public List<Star> findAllStars() {

		return repository.findAll();

	}
	
//	@ResponseBody
//	@GetMapping(value = "/findNewStar")
//	public Star findNewStar() {
//		List<Star> list =findAllStars();
//		if(list != null && !list.isEmpty()) {
//			return list.get(0);
//		}
//		return null;
//
//	}
	
	@ResponseBody
	@GetMapping(value = "/findNewStar")
	public Star findNewStar() {
		List<Star> list =findAllStars();
		if(list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;

	}
	
	

	
	
	

}
