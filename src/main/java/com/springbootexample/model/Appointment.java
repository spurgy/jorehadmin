package com.springbootexample.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="apointment_id")
	private Long id;
	
	@Column(name="appointment_phone")
	private String phone;
	
	@Column(name="appointment_cust_name")
	private String customerName;
	
	@Column(name="appointment_date")
	private Date appointmentDate;
	
	@Column(name="appointment_time")
	private String appointmentTime;
	
	@ManyToOne
	@JoinColumn(name="appointment_service_id")
	private Service service;
	
	@ManyToOne
	@JoinColumn(name="appointment_staff_id")
	private Staff staff;
	
	@Column(name="appointment_has_membership")
	private boolean hasMembership;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public boolean getHasMembership() {
		return hasMembership;
	}

	public void setHasMembership(boolean hasMembership) {
		this.hasMembership = hasMembership;
	}
	
}
