package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErheyiController2 {
	@Autowired
	private ErheyiRepository repository;

	@RequestMapping("/toErheyiAddEdit")
	public String toEdit(Model model, int id) {
		Erheyi ciji = null;
		if (id > 0) {
			ciji = repository.getOne(id);
		} else {
			ciji = new Erheyi();
		}

		model.addAttribute("ciji", ciji);
		return "Erheyi_add_edit";

	}

	@RequestMapping("/ErheyiAddEdit")
	public String togetherAddEdit(Erheyi ciji) {
		repository.save(ciji);
		return "redirect:/ErheyiList.htm";
	}

	@RequestMapping("/toErheyiDelete")
	public String toTogetherDelete(int id) {
		repository.deleteById(id);
		return "redirect:/ErheyiList.htm";
	}

}
