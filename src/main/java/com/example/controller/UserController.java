package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.User;
import com.example.model.UserForm;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Controller
@RequestMapping("")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserService userService;

	@ModelAttribute("user")
	public UserForm userForm() {
		return new UserForm();
	}

	@GetMapping("")
	public String index() {
		return "index";
	}

	@GetMapping("/welcome")
	public String welcom(Model model) {
		return "welcome";
	}

	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@GetMapping("/signup")
	public String showRegisterPage(Model model) {
		return "register";
	}
	@GetMapping("/profile")
	public String showProfile(Model model) {
		return "profile";
	}

	@PostMapping("/signup")
	public String registerAccout(@ModelAttribute("user") UserForm userForm) {
		userService.save(userForm);
		
		return "redirect:/login";
	}
	 
	@PostMapping("/login")
	public String signin(@ModelAttribute("user") UserForm userForm) {
		
		if(!userRepository.existsByUserName(userForm.getUserName())) {
			return"redirect:/register";
				
		}
		User user = userRepository.findUserByUserName(userForm.getUserName());
		
		String pass = user.getPassword();
		
		if (pass.equals(userForm.getPassword())) {
			return"redirect:/profile";
		}else {
			return "pass wrong";
		}
		
		
		
		
	}
}
