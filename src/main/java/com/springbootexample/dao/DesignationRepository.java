package com.springbootexample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootexample.model.Designation;

@Repository("designationRepository")
public interface DesignationRepository extends JpaRepository<Designation, Long>{
	Designation findByName(String name);
	Designation findById(Integer id);
}
