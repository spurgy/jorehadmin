package com.springbootexample.pojo;

import java.util.Date;

public class StaffDetails {
	private String staffFirstName;
	private String staffLastName;
	private String staffFatherName;
	private Date staffDateOfBirth;
	private Date staffJoiningDate;
	private CommunicationAddress communicationAddress;
	private CommunicationAddress permanentAddress;
	private Integer staffDesignation;
	private String staffPhoneNumber;
	private String staffEmail;
	
	public String getStaffFirstName() {
		return staffFirstName;
	}
	
	public void setStaffFirstName(String staffFirstName) {
		this.staffFirstName = staffFirstName;
	}
	
	public String getStaffLastName() {
		return staffLastName;
	}
	
	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}
	
	public String getStaffFatherName() {
		return staffFatherName;
	}
	
	public void setStaffFatherName(String staffFatherName) {
		this.staffFatherName = staffFatherName;
	}
	
	public Date getStaffDateOfBirth() {
		return staffDateOfBirth;
	}
	
	public void setStaffDateOfBirth(Date staffDateOfBirth) {
		this.staffDateOfBirth = staffDateOfBirth;
	}
	
	public Date getStaffJoiningDate() {
		return staffJoiningDate;
	}
	
	public void setStaffJoiningDate(Date staffJoiningDate) {
		this.staffJoiningDate = staffJoiningDate;
	}
	
	public CommunicationAddress getCommunicationAddress() {
		return communicationAddress;
	}
	
	public void setCommunicationAddress(CommunicationAddress communicationAddress) {
		this.communicationAddress = communicationAddress;
	}
	
	public CommunicationAddress getPermanentAddress() {
		return permanentAddress;
	}
	
	public void setPermanentAddress(CommunicationAddress permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	
	public Integer getStaffDesignation() {
		return staffDesignation;
	}
	
	public void setStaffDesignation(Integer staffDesignation) {
		this.staffDesignation = staffDesignation;
	}
	
	public String getStaffPhoneNumber() {
		return staffPhoneNumber;
	}
	
	public void setStaffPhoneNumber(String staffPhoneNumber) {
		this.staffPhoneNumber = staffPhoneNumber;
	}
	
	public String getStaffEmail() {
		return staffEmail;
	}
	
	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}

}
