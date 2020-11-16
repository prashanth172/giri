package com.company.giri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.giri.entity.Person;
import com.company.giri.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@PostMapping("save")
	public Person save(@RequestBody Person person) {
		
		personService.save(person);
		return person;
	}

}
