package com.springbootexample.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootexample.dao.CategoryRepository;
import com.springbootexample.dao.DesignationRepository;
import com.springbootexample.dao.DurationRepository;
import com.springbootexample.dao.MembershipRepository;
import com.springbootexample.dao.StaffRepository;
import com.springbootexample.model.Category;
import com.springbootexample.model.Designation;
import com.springbootexample.model.Duration;
import com.springbootexample.model.Membership;
import com.springbootexample.model.Staff;


@Service("ajaxService")
public class AjaxServiceImpl implements AjaxService{

	@Autowired
	private DesignationRepository designationrepository;
	
	@Autowired
	private StaffRepository staffrepository;
	
	@Autowired
	private DurationRepository durationRepository;
	
	@Autowired
	private MembershipRepository membershipRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
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

	@Override
	public List<Duration> getAllDuration() {
		return (List<Duration>)durationRepository.findAll();
	}
	
	@Override
	public List<Membership> getAllMembership() {
		return (List<Membership>)membershipRepository.findAll();
	}
	
	@Override
	public Map<Integer, String> getMembershipMap(){
		Map<Integer, String> memberships= new HashMap<Integer, String>();
		memberships.put(0, "Select Membership Type");
		for(Membership membership : membershipRepository.findAll()) {
			memberships.put(membership.getId(), membership.getName());
		}
		return memberships;
	}
	
	@Override
	public Map<Integer, String> getAllDurations(){
		Map<Integer, String> durations= new HashMap<Integer, String>();
		durations.put(0, "Select Duration");
		for(Duration duration : durationRepository.findAll()) {
			durations.put(duration.getId().intValue(), duration.getDurationPeriod()+" ("+duration.getDurationType()+')');
		}
		return durations;
	}
	
	@Override
	public List<Category> getCategoryList(){
		return (List<Category>)categoryRepository.findAll();
	}

	@Override
	public Map<Long, String> getCategoryMap() {
		// TODO Auto-generated method stub
		Map<Long, String> categories= new HashMap<Long, String>();
		categories.put( 0L, "Select Category");
		for(Category category : categoryRepository.findAll()) {
			categories.put(category.getId(), category.getName());
		}
		return categories;
	}
}
