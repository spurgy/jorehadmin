package com.springbootexample.pojo;

import java.util.Set;

import com.springbootexample.model.Category;
import com.springbootexample.model.Duration;
import com.springbootexample.model.Gender;
import com.springbootexample.model.Staff;

public class ServiceDetails {
	
	private Category catId;
	private String serviceName;
	private Gender availability;
	private Duration duration;
	private double price;
	private String membership;
	private String points;
	private Set<Staff> staff;
	

	public Category getCatId() {
		return catId;
	}

	public void setCatId(Category catId) {
		this.catId = catId;
	}

	public String getServiceName() {
		return serviceName;
	}
	
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	public Gender getAvailability() {
		return availability;
	}

	public void setAvailability(Gender availability) {
		this.availability = availability;
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

	public String getMembership() {
		return membership;
	}

	public void setMembership(String membership) {
		this.membership = membership;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public Set<Staff> getStaff() {
		return staff;
	}

	public void setStaff(Set<Staff> staff) {
		this.staff = staff;
	}
	
}
