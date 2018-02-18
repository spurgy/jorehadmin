package com.springbootexample.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootexample.model.Membership;


@Repository("membershipRepository")
public interface MembershipRepository extends CrudRepository<Membership, Long> {
}
