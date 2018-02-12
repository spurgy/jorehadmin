package com.springbootexample.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootexample.dao.DesignationRepository;
import com.springbootexample.dao.StaffRepository;
import com.springbootexample.model.Designation;
import com.springbootexample.model.Staff;


@Service("ajaxService")
public class AjaxServiceImpl implements AjaxService{

	@Autowired
	private DesignationRepository designationrepository;
	
	@Autowired
	private StaffRepository staffrepository;
	
	@Override
	public Map<Integer, String> getAllDesignations(){
		Map<Integer, String> designations= new HashMap<Integer, String>();
		for(Designation designation : designationrepository.findAll()) {
			designations.put(designation.getId(), designation.getName());
		}
		return designations;
	}
	
	@Override
	public List<Staff> getAllStaff(){
		return (List<Staff>) staffrepository.findAll();
	}
	

}
