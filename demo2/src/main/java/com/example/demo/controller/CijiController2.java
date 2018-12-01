package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CijiController2 {
	@Autowired
	private CijiRepository repository;

	
	@RequestMapping("/toSecondaryList")
    public String toSecondaryAdmin() {
        return "secondary/secondaryList";
    }
	
	

	@RequestMapping("/toSecondaryAddEdit")
	public String toEdit(Model model, int id) {
		Ciji ciji = null;
		if (id > 0) {
			ciji = repository.getOne(id);
		} else {
			ciji = new Ciji();
		}
		

		model.addAttribute("ciji", ciji);
		return "secondary_add_edit.html";
		
	}

	@RequestMapping("/secondaryAddEdit")
	public String secondaryAddEdit(Ciji ciji) {
		repository.save(ciji);
		return "redirect:/secondaryAdmin";
	}

	@RequestMapping("/toDelete")
	public String delete(int id) {
		repository.deleteById(id);
		return "redirect:/secondaryList.htm";
	}
	
	@RequestMapping("/helloHtml2")
    public String helloHtml(Model model){
		System.out.println("/helloHtml2");
 
       model.addAttribute("hello","from TemplateController.helloHtml");
       return"helloHtml";
    }

}
