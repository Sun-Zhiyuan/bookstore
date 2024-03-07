package com.example.bookstore.controller;

import com.example.bookstore.entity.Book;
import com.example.bookstore.entity.People;
import com.example.bookstore.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/people")
public class PeopleHandler {
    @Autowired
    private PeopleRepository peopleRepository;

    @GetMapping("/findById/{id}")
    public People findById(@PathVariable("id") Integer id){
        return peopleRepository.findById(id).get();
    }

    @GetMapping("/findAll/{page}/{size}")
    public Page<People> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Pageable pageable = PageRequest.of(page-1,size);
        return peopleRepository.findAll(pageable);
    }

    @PostMapping("/savePeople")
    public String save(@RequestBody People people){
        People result = peopleRepository.save(people);
        if(result != null){
            return "success";
        }
        else{
            return "error";
        }
    }

    @PutMapping("/update")
    public String Update(@RequestBody People people){
        People result = peopleRepository.save(people);
        if(result != null){
            return "success";
        }
        else{
            return "error";
        }
    }

    @GetMapping("/findPeopleById/{id}")
    public People findPeopleById(@PathVariable("id") Integer id){
        return peopleRepository.findById(id).get();
    }

}
