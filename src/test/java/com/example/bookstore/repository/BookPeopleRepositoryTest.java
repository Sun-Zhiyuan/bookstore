package com.example.bookstore.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookPeopleRepositoryTest {
    @Autowired
    private BookPeopleRepository bookpeoplerepository;
    @Test
    void findAll(){
        System.out.println(bookpeoplerepository.findAll());
    }
}
