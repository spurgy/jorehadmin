package com.springbootexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role extends TimeStampClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="myapp.role_role_id_seq")
    @SequenceGenerator(name="myapp.role_role_id_seq", sequenceName="myapp.role_role_id_seq", allocationSize=1)
	@Column(name="role_id")
	private Long id;
	@Column(name="role")
	private String role;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
