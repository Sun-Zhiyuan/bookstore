package com.example.bookstore.repository;

import com.example.bookstore.mapper.BPMapper;
import com.example.bookstore.services.userService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PeopleRepositoryTest {

    @Autowired
    private PeopleRepository peopleRepository;
    @Test
    void findAll(){
        System.out.println(peopleRepository.findAll());
    }


}