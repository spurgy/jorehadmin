package com.springbootexample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootexample.dao.AppointmentRepository;
import com.springbootexample.model.Appointment;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	AppointmentRepository appointmentRepository;
	
	@Override
	public void saveAppointment(Appointment appointment) {
		appointmentRepository.save(appointment);
	}
}
