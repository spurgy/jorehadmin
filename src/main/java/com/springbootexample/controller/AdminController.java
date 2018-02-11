package com.springbootexample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootexample.pojo.StaffDetails;
import com.springbootexample.services.AdminService;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value = "/staff")
    public String handleStaffRequest(HttpServletRequest request, Model model,@ModelAttribute StaffDetails staffDetails) {
		model.addAttribute("view", "staff");
		if(request.getMethod().matches("GET")) {
	        return "/base/base";
		}
		adminService.saveStaffDetails(staffDetails);
		return "/base/base";
    }
}
