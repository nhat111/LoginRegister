package com.example.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
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

	private String userName;
	private String firstName;
	private String lastName;
	private Date birthDay;
	private Gender gender;
	private String address;

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
		userService.save(userForm);

		return "redirect:/login";
	}

	@PostMapping("/login")
	public String signin(@ModelAttribute("user") UserForm userForm) {

		if (!userRepository.existsByUserName(userForm.getUserName())) {
			return "redirect:/register";

		}
		User user = userRepository.findUserByUserName(userForm.getUserName());

		String pass = user.getPassword();

		if (pass.equals(userForm.getPassword())) {

			userName = user.getUserName();
			firstName = user.getFirstName();
			lastName = user.getLastName();
			birthDay = user.getBirthDay();
			gender = user.getGender();
			address = user.getAddress();
			
			return "redirect:/profile";

		} else {
			return "redirect:/error.html";
		}
	}

	@GetMapping("/profile")
	public String showProfile(Model model) {
		model.addAttribute("userName", userName);
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		model.addAttribute("birthDay", birthDay);
		model.addAttribute("gender", gender);
		model.addAttribute("address", address);
		
		
		return "profile";
	}
}
