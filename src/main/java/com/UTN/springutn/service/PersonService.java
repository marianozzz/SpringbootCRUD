package com.UTN.springutn.service;

import com.UTN.springutn.model.Person;
import com.UTN.springutn.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PersonService {

    private final PersonRepository personRepository;

    @Autowired

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void addPerson(Person newPerson)
    {
        personRepository.save(newPerson);
    }

    public List<Person> getAll()
    {
       return personRepository.findAll();
    }
}
