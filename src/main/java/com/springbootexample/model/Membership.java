package com.springbootexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "membership")
public class Membership extends TimeStampClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="myapp.membership_membership_id_seq")
    @SequenceGenerator(name="myapp.membership_membership_id_seq", sequenceName="myapp.membership_membership_id_seq", allocationSize=1)
	@Column(name="membership_id")
	private Long id;
	
	@Column(name="membership_name")
	private String name;
	
	@Column(name="membership_price")
	private double price;
	
	@ManyToOne
	@JoinColumn(name="duration_id")
	private Duration duration;

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}
}
