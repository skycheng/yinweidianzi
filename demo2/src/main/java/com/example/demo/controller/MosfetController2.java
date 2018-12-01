package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MosfetController2 {
	@Autowired
	private MosfetRepository repository;

	@RequestMapping("/toMosfetAddEdit")
	public String toEdit(Model model, int id) {
		Mosfet ciji = null;
		if (id > 0) {
			ciji = repository.getOne(id);
		} else {
			ciji = new Mosfet();
		}

		model.addAttribute("ciji", ciji);
		return "Mosfet_add_edit";

	}

	@RequestMapping("/MosfetAddEdit")
	public String togetherAddEdit(Mosfet ciji) {
		repository.save(ciji);
		return "redirect:/MosfetList.htm";
	}

	@RequestMapping("/toMosfetDelete")
	public String toMosfetDelete(int id) {
		repository.deleteById(id);
		return "redirect:/MosfetList.htm";
	}

}
