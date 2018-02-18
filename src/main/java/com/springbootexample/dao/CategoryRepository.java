package com.springbootexample.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootexample.model.Category;


@Repository("categoryRepository")
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
