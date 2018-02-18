package com.springbootexample.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootexample.model.Duration;


@Repository("durationRepository")
public interface DurationRepository extends CrudRepository<Duration, Long> {
}
