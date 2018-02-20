package com.springbootexample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootexample.model.Category;


@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
