package com.springbootexample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootexample.model.Service;

@Repository("serviceRepository")
public interface ServiceRepository extends JpaRepository<Service, Long>{
}
