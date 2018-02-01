package com.springbootexample.dao;

import org.springframework.data.repository.CrudRepository;

import com.springbootexample.model.Person;


public interface PersonRepository extends CrudRepository<Person, Long> {

}