package com.example.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Gender;
import com.example.model.User;
import com.example.model.UserForm;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Controller
@RequestMapping("")
public class UserController {
	private String msgError;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserService userService;

	@ModelAttribute("user")
	public UserForm userForm() {
		return new UserForm();
	}
	
	@GetMapping("/login")
	public String showLoginPage(Model model) {
		return "login";
	}

	@GetMapping("/signup")
	public String showRegisterPage(Model model) {
		return "register";
	}

	@PostMapping("/signup")
	public String registerAccout(@ModelAttribute("user") UserForm userForm) {
		if (userRepository.existsByUserName(userForm.getUserName())) {
			msgError = "user exist";
			return "redirect:/msgerror";
		}

		userService.save(userForm);

		return "redirect:/login";
	}

	@GetMapping("/profile")
	public String showProfile(Model model, UserForm userForm) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String userLogin = auth.getName();

		User user = userRepository.findUserByUserName(userLogin);

		String userName = user.getUserName();
		String firstName = user.getFirstName();
		String lastName = user.getLastName();
		Date birthDay = user.getBirthDay();
		Gender gender = user.getGender();
		String address = user.getAddress();

		model.addAttribute("userName", userName);
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		model.addAttribute("birthDay", birthDay);
		model.addAttribute("gender", gender);
		model.addAttribute("address", address);

		return "profile";
	}

	@GetMapping("/msgerror")
	public String home(Model model) {
		model.addAttribute("message", msgError);
		return "errorpage";
	}

}
