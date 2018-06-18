package com.springbootexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "services_category")
public class Category extends TimeStampClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="myapp.services_category_services_category_id_seq")
    @SequenceGenerator(name="myapp.services_category_services_category_id_seq", sequenceName="myapp.services_category_services_category_id_seq", allocationSize=1)
	@Column(name="services_category_id")
	private Long id;
	
	@Column(name="services_category_name")
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
