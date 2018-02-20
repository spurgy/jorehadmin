package com.springbootexample.services;

import com.springbootexample.model.User;


public interface UserService {
	
	public User findUserByEmail(String email);
	
	public void saveUser(User user);
	
}
