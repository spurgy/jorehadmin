package com.springbootexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "designation")
public class Designation extends TimeStampClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="myapp.designation_desig_id_seq")
    @SequenceGenerator(name="myapp.designation_desig_id_seq", sequenceName="myapp.designation_desig_id_seq", allocationSize=1)
	@Column(name="desig_id")
	private Long id;
	@Column(name="desig_name")
	private String name;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
