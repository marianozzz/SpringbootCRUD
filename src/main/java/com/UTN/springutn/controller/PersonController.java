package com.UTN.springutn.controller;


import com.UTN.springutn.model.Person;
import com.UTN.springutn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Va a ser un Restcontroller va a exponer esta clase a distintas url
@RestController("")
//Mi ruta general de toda la clases
@RequestMapping("/person")


public class PersonController
{

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService)
    {
        this.personService = personService;
    }

    @GetMapping("/{Person}")
    public Person getPersonById(@PathVariable Integer PersonId)
    {
        return new Person();
    }

    @PostMapping("/")
    public void addPerson(@RequestBody  Person newPerson)
    {
    personService.addPerson(newPerson);
    }

    @GetMapping("/")
    public List<Person> getAll()
    {
        return personService.getAll();
    }

}
