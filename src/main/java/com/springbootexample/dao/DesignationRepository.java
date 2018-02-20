package com.springbootexample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootexample.model.Designation;

public interface DesignationRepository extends JpaRepository<Designation, Integer>{
	Designation findByName(String name);
	Designation findById(Integer id);
}
