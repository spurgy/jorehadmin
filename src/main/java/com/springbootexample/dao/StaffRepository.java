package com.springbootexample.dao;

import org.springframework.data.repository.CrudRepository;

import com.springbootexample.model.Staff;

public interface StaffRepository extends CrudRepository<Staff, Integer>{
}
