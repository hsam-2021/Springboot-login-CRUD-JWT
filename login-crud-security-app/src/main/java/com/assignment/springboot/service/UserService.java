package com.assignment.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.assignment.springboot.model.User;
import com.assignment.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);

}
