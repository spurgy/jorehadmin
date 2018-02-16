package com.springbootexample.pojo;

public class SetupDetails {
	private String membershipName;
	private String membershipDuration;
	private Double membershipPrice;
	private Integer duration;
	
	public String setmembeshipName() {
		return membershipName;
	}
	
	public void getmembeshipName(String membershipName) {
		this.membershipName = membershipName;
	}
	
	public String setmembershipDuration() {
		return membershipDuration;
	}
	
	public void getmembershipDuration(String membershipDuration) {
		this.membershipDuration = membershipName;
	}
	
	public Double setmembershipPrice() {
		return membershipPrice;
	}
	
	public void getmembershipPrice(Double membershipPrice) {
		this.membershipPrice = membershipPrice;
	}
	
	public Integer setduration() {
		return duration;
	}
	
	public void getduration(Integer duration) {
		this.duration = duration;
	}
}
