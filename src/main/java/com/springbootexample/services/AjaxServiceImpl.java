package com.springbootexample.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootexample.dao.CategoryRepository;
import com.springbootexample.dao.DesignationRepository;
import com.springbootexample.dao.DurationRepository;
import com.springbootexample.dao.GenderRepository;
import com.springbootexample.dao.MembershipRepository;
import com.springbootexample.dao.ServiceRepository;
import com.springbootexample.dao.StaffRepository;
import com.springbootexample.model.Category;
import com.springbootexample.model.Designation;
import com.springbootexample.model.Duration;
import com.springbootexample.model.Gender;
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
	
	@Autowired
	private GenderRepository genderRepository;
	
	@Autowired
	private ServiceRepository serviceRepository;

	@Override
	public Map<Integer, String> getAllDesignations(){
		Map<Integer, String> designations= new HashMap<Integer, String>();
		for(Designation designation : designationrepository.findAll()) {
			designations.put(designation.getId().intValue(), designation.getName());
		}
		return designations;
	}
	
	@Override
	public List<Staff> getAllStaffList(){
		return staffrepository.findAll();
	}
	
	@Override
	public Map<Integer, String> getAllStaffMap(){
		Map<Integer, String> staffs= new HashMap<Integer, String>();
		staffs.put(0, "Select Staff");
		for(Staff staff : staffrepository.findAll()) {
			staffs.put(staff.getId().intValue(), staff.getName());
		}
		return staffs;
	}

	@Override
	public List<Duration> getAllDuration() {
		return durationRepository.findAll();
	}
	
	@Override
	public List<Membership> getAllMembership() {
		return membershipRepository.findAll();
	}
	
	@Override
	public Map<Integer, String> getMembershipMap(){
		Map<Integer, String> memberships= new HashMap<Integer, String>();
		memberships.put(0, "Select Membership Type");
		for(Membership membership : membershipRepository.findAll()) {
			memberships.put(membership.getId().intValue(), membership.getName());
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
		return categoryRepository.findAll();
	}

	@Override
	public Map<Long, String> getCategoryMap() {
		Map<Long, String> categories= new HashMap<Long, String>();
		categories.put( 0L, "Select Category");
		for(Category category : categoryRepository.findAll()) {
			categories.put(category.getId(), category.getName());
		}
		return categories;
	}

	@Override
	public Map<Integer, String> getGenderMap() {
		Map<Integer, String> genders= new HashMap<Integer, String>();
		for(Gender gender : genderRepository.findAll()) {
			genders.put(gender.getId().intValue(), gender.getName());
		}
		return genders;
	}
	
	@Override
	public Map<Integer, String> getServiceMap() {
		Map<Integer, String> services = new HashMap<Integer, String>();
		services.put( 0, "Select Service");
		for(com.springbootexample.model.Service service : serviceRepository.findAll()) {
			services.put(service.getId().intValue(), service.getName());
		}
		return services;
	}
}
