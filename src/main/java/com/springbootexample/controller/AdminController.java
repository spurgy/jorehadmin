package com.springbootexample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springbootexample.model.Category;
import com.springbootexample.model.Duration;
import com.springbootexample.model.Membership;
import com.springbootexample.pojo.ServiceDetails;
import com.springbootexample.pojo.StaffDetails;
import com.springbootexample.services.AdminService;
import com.springbootexample.services.AjaxService;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	@Autowired
	private AjaxService ajaxservice;
	
	@RequestMapping(value = "/staff")
    public String handleStaffRequest(HttpServletRequest request, Model model,@ModelAttribute StaffDetails staffDetails) {
		model.addAttribute("view", "staff");
		if(request.getMethod().matches("GET")) {
	        return "/base/base";
		}
		adminService.saveStaffDetails(staffDetails);
		return "redirect:/admin/staff";
    }
		
	@RequestMapping(value = "/setup")
    public ModelAndView handleSetupRequest(HttpServletRequest request, ModelAndView model,
    		@ModelAttribute Membership membership,
    		@ModelAttribute Duration duration,
    		@RequestParam(value="addMethod", required=false) String addMethod) {
		model.addObject("view", "setup");
		if(request.getMethod().matches("GET")) {
			model.setViewName("/base/base");
			model.addObject("durationObject", new Duration());
			model.addObject("membershipObject", new Membership());
			return model;
		}
		if(duration != null && "duration".equals(addMethod)) {
			adminService.saveDuration(duration);
		}
		if(membership != null && "membership".equals(addMethod)) {
			adminService.saveMember(membership);
		}
		return new ModelAndView("redirect:/admin/setup");
    }
	
	@RequestMapping(value = "/services")
    public ModelAndView services(HttpServletRequest request, ModelAndView model,
    		@ModelAttribute Category category,
    		@ModelAttribute ServiceDetails serviceDetails,
    		@RequestParam(value="addMethod", required=false) String addMethod) {
		model.addObject("view", "services");
		if(request.getMethod().matches("GET")) {
			model.setViewName("/base/base");
			model.addObject("serviceDetails", new ServiceDetails());
			model.addObject("categoryObject", new Category());
			model.addObject("staffMap", ajaxservice.getAllStaffList());
			return model;
		}
		if(category != null && "addCategory".equals(addMethod)) {
			adminService.saveCategory(category);
		}
		if(serviceDetails != null && "addService".equals(addMethod)) {
			adminService.saveService(serviceDetails);
		}
		return new ModelAndView("redirect:/admin/services");
    }
}
