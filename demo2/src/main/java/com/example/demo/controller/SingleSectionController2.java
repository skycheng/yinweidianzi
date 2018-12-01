package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SingleSectionController2 {
	@Autowired
	private SingleSectionRepository repository;

	@RequestMapping("/toSingleSectionAddEdit")
	public String toEdit(Model model, int id) {
		SingleSection ciji = null;
		if (id > 0) {
			ciji = repository.getOne(id);
		} else {
			ciji = new SingleSection();
		}

		model.addAttribute("ciji", ciji);
		return "SingleSection_add_edit";

	}

	@RequestMapping("/SingleSectionAddEdit")
	public String togetherAddEdit(SingleSection ciji) {
		repository.save(ciji);
		return "redirect:/SingleSectionList.htm";
	}

	@RequestMapping("/toSingleSectionDelete")
	public String toTogetherDelete(int id) {
		repository.deleteById(id);
		return "redirect:/SingleSectionList.htm";
	}

}
