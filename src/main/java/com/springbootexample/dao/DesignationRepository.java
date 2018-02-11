package com.springbootexample.dao;

import org.springframework.data.repository.CrudRepository;

import com.springbootexample.model.Designation;

public interface DesignationRepository extends CrudRepository<Designation, Integer>{
	Designation findByName(String name);
}
