package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@ResponseBody
	@GetMapping(value = "/findTop1Star")
	public Star findTop1Star() {
		return repository.findTop1();

	}
	
	@RequestMapping("/ToStarAddEdit")
	public String toEdit(Model model, int id) {
		Star ciji = null;
		if (id > 0) {
			ciji = repository.getOne(id);
		} else {
			ciji = new Star();
		}

		model.addAttribute("ciji", ciji);
		return "star_add_edit";

	}
	
	@RequestMapping("/ShowStar")
	public String showStar(Model model) {
		Star ciji = findTop1Star();

		model.addAttribute("ciji", ciji);
		return "star";

	}


	@RequestMapping("/StarAddEdit")
	public String starAddEdit(Star ciji) {
		repository.save(ciji);
		return "redirect:/star.htm";
	}

	@RequestMapping("/ToStarDelete")
	public String toStarDelete(int id) {
		repository.deleteById(id);
		return "redirect:/star.htm";
	}
	
	

	
	
	

}
