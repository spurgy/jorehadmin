package com.springbootexample.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springbootexample.model.Staff;
import com.springbootexample.services.AjaxService;

@Controller
@RequestMapping(value = "/util")
public class AjaxController {
	
	@Autowired
	private AjaxService ajaxservice;
	
	@RequestMapping(value = "/getDesignations")
	@ResponseBody
    public Map<Integer,String> dashboard() {
		Map<Integer, String> designations = ajaxservice.getAllDesignations();
        return designations;
    }
	
	@RequestMapping(value = "/getStaff")
	@ResponseBody
    public List<Staff> getStaffDataTable() {
		return ajaxservice.getAllStaff();
    }
}
