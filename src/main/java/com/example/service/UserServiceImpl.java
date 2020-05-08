package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.model.UserForm;
import com.example.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(UserForm userForm) {
		User user = new User();
		user.setUserName(userForm.getUserName());
		user.setPassword(userForm.getPassword());	
		return userRepository.save(user);
	}

}
