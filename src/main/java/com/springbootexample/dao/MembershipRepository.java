package com.springbootexample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootexample.model.Membership;


@Repository("membershipRepository")
public interface MembershipRepository extends JpaRepository<Membership, Long> {
	Membership findById(Long id);
}
