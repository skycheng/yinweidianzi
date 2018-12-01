package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MultiSectionController2 {
	@Autowired
	private MultiSectionRepository repository;

	@RequestMapping("/toMultiSectionAddEdit")
	public String toEdit(Model model, int id) {
		Multisection ciji = null;
		if (id > 0) {
			ciji = repository.getOne(id);
		} else {
			ciji = new Multisection();
		}

		model.addAttribute("ciji", ciji);
		return "MultiSection_add_edit";

	}

	@RequestMapping("/MultiSectionAddEdit")
	public String MultiSectionAddEdit(Multisection ciji) {
		repository.save(ciji);
		return "redirect:/MultiSectionList.htm";
	}

	@RequestMapping("/toMultiSectionDelete")
	public String toTogetherDelete(int id) {
		repository.deleteById(id);
		return "redirect:/MultiSectionList.htm";
	}

}
