package com.springbootexample.services;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.springbootexample.dao.DesignationRepository;
import com.springbootexample.dao.RoleRepository;
import com.springbootexample.dao.StaffRepository;
import com.springbootexample.model.Role;
import com.springbootexample.model.Staff;
import com.springbootexample.model.User;
import com.springbootexample.pojo.StaffDetails;


@Service("adminService")
public class AdminServiceImpl implements AdminService{
	
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
    private RoleRepository roleRepository;
	@Autowired
    private DesignationRepository designationRepository;
	@Autowired
    private StaffRepository staffrepository;
	
	public void saveStaffDetails(StaffDetails staffDetails) {
		Staff staff = new Staff();
		staff.setCommunicationArea(staffDetails.getCommunicationAddress().getArea());
		staff.setCommunicationCity(staffDetails.getCommunicationAddress().getCity());
		staff.setCommunicationStreet(staffDetails.getCommunicationAddress().getStreetName());
		staff.setDateOfBirth(staffDetails.getStaffDateOfBirth());
		staff.setDateOfJoining(staffDetails.getStaffJoiningDate());
		staff.setDesignation(designationRepository.findById(staffDetails.getStaffDesignation()));
		staff.setEmail(staffDetails.getStaffEmail());
		staff.setFatherName(staffDetails.getStaffFatherName());
		staff.setName(staffDetails.getStaffLastName()+staffDetails.getStaffFirstName());
		staff.setPermanentArea(staffDetails.getPermanentAddress().getArea());
		staff.setPermanentCity(staffDetails.getPermanentAddress().getCity());
		staff.setPermanentStreet(staffDetails.getPermanentAddress().getStreetName());
		staff.setPhoneNumber(staffDetails.getStaffPhoneNumber());
		staff.setSalary(2000.0);
		User user = new User();
		user.setActive(1);
		user.setEmail(staffDetails.getStaffEmail());
		user.setLastName(staffDetails.getStaffLastName());
		user.setName(staffDetails.getStaffFirstName());
		user.setRoles(new HashSet<Role>(Arrays.asList(roleRepository.findByRole("USER"))));
		user.setPassword(bCryptPasswordEncoder.encode("Test@123"));
//		user.setCreated();
//		user.setUpdated();
		staff.setUser(user);
//		staff.setCreated(new Date());
//		staff.setUpdated(new Date());
		staffrepository.save(staff);
	}
}
