package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.UserForm;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Controller
@RequestMapping("")
public class UserController {
	
//	@Autowired
	//private UserRepository userRepository;
	
	@Autowired
	private UserService userService;
	
	
	@ModelAttribute("user")
	public UserForm userForm() {
		return new UserForm();
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@GetMapping("/registration")
	public String showRegisterPage(Model model) {
		return "register";
	}
	
	@PostMapping("/registration")
	public String registerAccout(@ModelAttribute("user") UserForm userForm) {
		
	userService.save(userForm);
		
		return "";
	}

}
