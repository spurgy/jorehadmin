package com.springbootexample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootexample.model.User;


@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
	
	 User findByEmail(String email);
	 
	 public long count();
}
