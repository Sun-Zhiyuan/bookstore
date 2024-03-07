package com.example.bookstore.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class People {
    @Id
    private Integer id;
    private String name;
    private boolean vip;
    private String password;
    private Integer money;
    private Integer phone;
    private String city;
    private String address;
}
