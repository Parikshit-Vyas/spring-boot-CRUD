package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@RequestMapping("api/v1/person")

@RestController
public class PersonController {

    private final PersonService personService;


    @Autowired
    public PersonController( PersonService personService){
        this.personService = personService;
    }

    @PostMapping // for post requests
    public void addPerson(@Valid @NonNull @RequestBody Person person){
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }

    @GetMapping(path="/{id}")
    public Optional<Person> getPersonById(@PathVariable("id") UUID id){
        return personService.getPersonById(id) ;


    }

    @DeleteMapping(path="/{id}")
    public int deletePerson(@PathVariable("id") UUID id){
        return personService.deletePerson(id);
    }

    @PutMapping(path="/{id}")
    public int updatePerson(@PathVariable("id") UUID id , @Valid @NonNull @RequestBody Person person){
        return personService.updatePerson(id,person);
    }
}
