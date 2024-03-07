package com.example.bookstore.repository;

import com.example.bookstore.entity.time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<time,Integer> {
}
