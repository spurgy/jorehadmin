package com.springbootexample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootexample.model.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer>{
}
