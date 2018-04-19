package com.springbootexample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springbootexample.dao.PersonRepository;
import com.springbootexample.model.Appointment;
import com.springbootexample.model.Person;
import com.springbootexample.services.PersonService;


@Controller
@RequestMapping(value = "/person")
public class PersonsController {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
    private PersonRepository personDao;
	
	@RequestMapping(value = "/home")
    public String dashboard(Model model) {
		model.addAttribute("view", "dashboard");
        //return "/base/base";
        return "base";
    }
	
	@RequestMapping(value = "/appointment")
    public ModelAndView appointment(HttpServletRequest request, ModelAndView model,
    		@ModelAttribute Appointment appointment,
    		@RequestParam(value="addMethod", required=false) String addMethod) {
		model.addObject("view", "appointment");
		if(request.getMethod().matches("GET")) {
			model.setViewName("base");
			model.addObject("appointment", new Appointment());
			return model;
		}
		if(appointment != null && "appointment".equals(addMethod)) {
			personService.saveAppointment(appointment);
		}
        return new ModelAndView("redirect:/person/appointment");
    }
	
	@RequestMapping(value = "/bill")
    public String bill(Model model) {
		model.addAttribute("view", "bill");
        return "base";
    }
	
	@RequestMapping(value = "/inventory")
    public String inventory(Model model) {
		model.addAttribute("view", "inventory");
        return "base";
    }
 
    @RequestMapping(value = "/delete")
    public String delete(@RequestParam(value="id") long id, Model model) {
        try {
            Person person = new Person();
            person.setId(id);
            personDao.delete(person);
            model.addAttribute("name", "Person succesfully deleted!");
        } catch (Exception ex) {
            return ex.getMessage();
        }
        return "greeting";
    }
 
    @RequestMapping(value = "/save")
    public String create(@RequestParam(value="name", required=false, defaultValue="World") String name,@RequestParam(value="city", required=false, defaultValue="World") String city, Model model) {
        try {
            Person person = new Person();
            person.setName(name);
            person.setCity(city);
            personDao.save(person);
            model.addAttribute("name", "Person succesfully saved!");
            
        } catch (Exception ex) {
            return ex.getMessage();
        }
        return "greeting";
    }
    @RequestMapping(value = "/all")
    @ResponseBody
    public String getAllPersons() {
        try {
            return personDao.findAll().toString();
        } catch (Exception ex) {
            return null;
        }
    }
}
