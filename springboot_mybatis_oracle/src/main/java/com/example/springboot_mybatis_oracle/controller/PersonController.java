package com.example.springboot_mybatis_oracle.controller;

import com.example.springboot_mybatis_oracle.model.Person;
import com.example.springboot_mybatis_oracle.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/")
    public String getOne(Model model){
        List<Person> personList=personService.findAll();
        if (personList.size()<=0){
            Person person=new Person();
            person.setId(1l);
            person.setName("person");
            person.setAge(22);
            model.addAttribute("person",person);
        }else {
            model.addAttribute("person",personList.get(0));
        }
        return "person/index";
    }
}
