package com.example.bookstore;

import com.example.bookstore.entity.Book;
import com.example.bookstore.entity.People;
import com.example.bookstore.repository.BookRepository;
import com.example.bookstore.repository.PeopleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class BookstoreApplicationTests {
    @Autowired
    private BookRepository repository;
    @Autowired
    private PeopleRepository peopleRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void save(){
        Book book = new Book();
        book.setName("Spring Boot");
        book.setAuthor("张三");
        Book book1 = repository.save(book);
        System.out.println(book1);
    }

    @Test
    void findById(){
        Book book = repository.findById(1).get();
        System.out.println(book);
    }

    @Test
    void update(){
        Book book = new Book();
        book.setId(117);
        book.setName("测试测试");
        Book book1 = repository.save(book);
        System.out.println(book1);
    }

    @Test
    void delete(){
        repository.deleteById(122);
    }

    @Test
    void findPeopleById(){
        People people = peopleRepository.findById(12345).get();
        System.out.println(people);
    }
}
