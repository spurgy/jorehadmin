package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springbootexample.dao.PersonRepository;
import com.springbootexample.model.Person;

@Controller
public class GreetingController {
	
	@Autowired
    private PersonRepository personDao;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
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

}
