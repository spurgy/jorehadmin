package com.springbootexample.services;

import java.util.List;
import java.util.Map;

import com.springbootexample.model.Category;
import com.springbootexample.model.Duration;
import com.springbootexample.model.Membership;
import com.springbootexample.model.Staff;

public interface AjaxService {
	public Map<Integer, String> getAllDesignations();
	
	public List<Staff> getAllStaffList();
	
	public Map<Integer, String> getAllStaffMap();
	
	public List<Duration> getAllDuration();
	
	public Map<Integer, String> getAllDurations();
	
	public List<Membership> getAllMembership();
	
	public Map<Integer, String> getMembershipMap();
	
	public List<Category> getCategoryList();

	public Map<Long, String> getCategoryMap();

	public Map<Integer, String> getGenderMap();
	
	public Map<Integer, String> getServiceMap();
}
