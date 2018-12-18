package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	@Autowired
	private UserRepository repository;

	
	@ResponseBody
	@PostMapping(value = "/login")
	public YpwResponse login(@RequestParam("name") String name,@RequestParam("password") String password,HttpSession session) {
		YpwResponse response = new YpwResponse();
		List<User> users = repository.findUser(name, password);
		if(users != null && !users.isEmpty()) {
			response.setCode(200);
			Utils.IS_LOGINED = true;
			session.setAttribute("isLogin", response);
		}else{
			response.setCode(201);
			response.setMessage("用户名或者密码错误");
	
		}
		return response;
		

	}
	
	
	
	@RequestMapping("/logout")
	public String logout(int id,HttpSession session) {
		Utils.IS_LOGINED = false;
		session.removeAttribute("isLogin");
		return "redirect:/login.htm";
	}

	
	

	
	
	

}
