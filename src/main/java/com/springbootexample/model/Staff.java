package com.springbootexample.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "staff")
public class Staff extends TimeStampClass{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "staff_id")
    private Long id;
	
	@Column(name = "staff_name")
    private String name;
    
	@Column(name = "staff_dob")
    private Date dateOfBirth;
    
	@Column(name = "staff_doj")
    private Date dateOfJoining;
    
	@Column(name = "staff_phone")
    private String phoneNumber;
    
	@Column(name = "staff_designation")
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "desig_id")
    private Designation designation;
    
	@Column(name = "staff_fathername")
    private String fatherName;
    
	@Column(name = "staff_email")
    private String email;
    
	@Column(name = "staff_c_street")
    private String communicationStreet;
    
	@Column(name = "staff_c_area")
    private String communicationArea;
    
	@Column(name = "staff_c_city")
    private String communicationCity;
    
	@Column(name = "staff_p_street")
    private String permanentStreet;
    
	@Column(name = "staff_p_area")
    private String permanentArea;
    
	@Column(name = "staff_p_city")
    private String permanentCity;
    
	@Column(name = "staff_salary")
    private double salary;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "staff_role_relation", joinColumns = @JoinColumn(name = "staff_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private User user;
    
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCommunicationStreet() {
		return communicationStreet;
	}

	public void setCommunicationStreet(String communicationStreet) {
		this.communicationStreet = communicationStreet;
	}

	public String getCommunicationArea() {
		return communicationArea;
	}

	public void setCommunicationArea(String communicationArea) {
		this.communicationArea = communicationArea;
	}

	public String getCommunicationCity() {
		return communicationCity;
	}

	public void setCommunicationCity(String communicationCity) {
		this.communicationCity = communicationCity;
	}

	public String getPermanentStreet() {
		return permanentStreet;
	}

	public void setPermanentStreet(String permanentStreet) {
		this.permanentStreet = permanentStreet;
	}

	public String getPermanentArea() {
		return permanentArea;
	}

	public void setPermanentArea(String permanentArea) {
		this.permanentArea = permanentArea;
	}

	public String getPermanentCity() {
		return permanentCity;
	}

	public void setPermanentCity(String permanentCity) {
		this.permanentCity = permanentCity;
	}

	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
