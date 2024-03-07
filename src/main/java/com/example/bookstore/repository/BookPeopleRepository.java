package com.example.bookstore.repository;

import com.example.bookstore.entity.bookofpeople;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPeopleRepository extends JpaRepository<bookofpeople,Integer> {

}
