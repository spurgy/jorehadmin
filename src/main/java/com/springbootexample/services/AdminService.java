package com.springbootexample.services;

import com.springbootexample.model.Category;
import com.springbootexample.model.Duration;
import com.springbootexample.model.Membership;
import com.springbootexample.pojo.StaffDetails;

public interface AdminService {
	public void saveStaffDetails(StaffDetails staffDetails);
	
	public void saveDuration(Duration duration);
	
	public void saveMember(Membership membership);
	
	public void saveCategory(Category category);
	
}
