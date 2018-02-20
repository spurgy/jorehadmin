package com.springbootexample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootexample.model.Duration;


@Repository("durationRepository")
public interface DurationRepository extends JpaRepository<Duration, Long> {
}
