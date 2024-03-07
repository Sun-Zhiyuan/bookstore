package com.example.bookstore.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class bookofpeople implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookid;
    private Integer peopleid;
    private String peoplename;
    private String bookname;
    private String bookauthor;
    private float bpdiscount;
    private float bpprice;
    private boolean overdue;
}
