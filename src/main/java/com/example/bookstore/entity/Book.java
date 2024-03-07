package com.example.bookstore.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Book {
    public Book(){

    }
    @Id
    private Integer id;
    private String name;
    private String author;
    private float price;
    private float discount;
    public  Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public  String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
