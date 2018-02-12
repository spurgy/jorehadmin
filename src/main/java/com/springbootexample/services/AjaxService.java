package com.springbootexample.services;

import java.util.List;
import java.util.Map;

import com.springbootexample.model.Staff;

public interface AjaxService {
	public Map<Integer, String> getAllDesignations();
	
	public List<Staff> getAllStaff();
}
