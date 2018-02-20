package com.springbootexample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootexample.model.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {

}