package com.example.bookstore.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class time {
    @Id
    Integer Id;
    String date;
}
