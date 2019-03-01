package ycm.town.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ycm.town.model.Person;
import ycm.town.service.IPersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
    
    private IPersonService personService;
    
    public IPersonService getPersonService() {
        return personService;
    }

    @Autowired
    public void setPersonService(IPersonService personService) {
        this.personService = personService;
    }
    
    @RequestMapping(path="/list", method=RequestMethod.GET)
    public String showPersons(Model model){
        List<Person> persons = personService.loadPersons();
        model.addAttribute("persons", persons);
        
        return "persons";
    }
    
    @RequestMapping(path="/update", method=RequestMethod.POST)
    public String updatePersonName(@RequestParam("id") int id, @RequestParam("name") String name, Model model){
    	personService.updatePersonName(id, name);
    	
        List<Person> persons = personService.loadPersons();
        model.addAttribute("persons", persons);
        
        return "persons";
    }
    
    @RequestMapping(path="/{id}", method=RequestMethod.GET)
    @ResponseBody
    public Person getPerson(@PathVariable("id") int id){
        Person person = personService.getPerson(id);
        return person;
    }
}