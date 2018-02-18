package com.springbootexample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springbootexample.model.Category;
import com.springbootexample.model.Duration;
import com.springbootexample.model.Membership;
import com.springbootexample.model.Staff;
import com.springbootexample.model.User;
import com.springbootexample.services.AjaxService;
import com.springbootexample.services.UserService;

@Controller
@RequestMapping(value = "/util")
public class AjaxController {
	
	@Autowired
	private AjaxService ajaxservice;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/getDesignationsMap")
	@ResponseBody
    public Map<Integer,String> getDesignationsMap() {
		Map<Integer, String> designations = ajaxservice.getAllDesignations();
        return designations;
    }
	
	@RequestMapping(value = "/getDurationMap")
	@ResponseBody
    public Map<Integer,String> durations() {
		Map<Integer, String> durations = ajaxservice.getAllDurations();
        return durations;
    }
	
	@RequestMapping(value = "/getStaffList")
	@ResponseBody
    public List<Staff> getStaffDataTable() {
		return ajaxservice.getAllStaff();
    }
	
	@RequestMapping(value = "/getDurationList")
	@ResponseBody
    public List<Duration> getDurationDataTable() {
		return ajaxservice.getAllDuration();
    }
	
	@RequestMapping(value = "/getMembershipList")
	@ResponseBody
    public List<Membership> Memberships() {
		return ajaxservice.getAllMembership();
    }
	
	@RequestMapping(value = "/getCategoryList")
	@ResponseBody
    public List<Category> getCategoryList() {
		return ajaxservice.getCategoryList();
    }
	
	@RequestMapping(value = "/checkEmail")
	@ResponseBody
    public Map<String, Integer> checkEmail(@RequestParam(value="email", required=false) String email) {
		Map<String, Integer> status = new HashMap<String, Integer>();
		User userExists = userService.findUserByEmail(email);
		if (userExists != null) {
			status.put("status", 1);
			return status;
		}
		status.put("status", 0);
		return status;
    }
}
