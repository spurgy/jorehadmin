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
	public Map<Integer, String> getAllDurations(){
		Map<Integer, String> durations= new HashMap<Integer, String>();
		for(Duration duration : durationRepository.findAll()) {
			durations.put(duration.getId().intValue(), duration.getDurationPeriod()+" ("+duration.getDurationType()+')');
		}
		return durations;
	}
	
	@Override
	public List<Category> getCategoryList(){
		return (List<Category>)categoryRepository.findAll();
	}
}
