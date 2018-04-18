package com.springbootexample.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "service")
public class Service {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="service_id")
	private Long id;
	
	@Column(name="service_name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="service_category_id")
	private Category category;
	
	
	@ManyToOne
	@JoinColumn(name="service_availablefor_id")
	private Gender gender;
	
	@ManyToOne
	@JoinColumn(name="service_duration_id")
	private Duration duration;
	
	@Column(name="service_price")
	private double price;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "service_loyalty_points", joinColumns = @JoinColumn(name = "service_id"), inverseJoinColumns = @JoinColumn(name = "loyalty_id"))
	private Set<LoyaltyPoints> loyaltyPoints;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "service_staff", joinColumns = @JoinColumn(name = "service_id"), inverseJoinColumns = @JoinColumn(name = "staff_id"))
	private Set<Staff> staffList;

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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Set<LoyaltyPoints> getLoyaltyPoints() {
		return loyaltyPoints;
	}

	public void setLoyaltyPoints(Set<LoyaltyPoints> loyaltyPoints) {
		this.loyaltyPoints = loyaltyPoints;
	}

	public Set<Staff> getStaffList() {
		return staffList;
	}

	public void setStaffList(Set<Staff> staffList) {
		this.staffList = staffList;
	}
}
