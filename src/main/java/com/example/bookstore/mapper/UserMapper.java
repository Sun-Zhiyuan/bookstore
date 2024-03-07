package com.example.bookstore.mapper;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {
    //@Select("insert into muziuser(Id,name,age,sex) values (#{Id},#{name},#{age},#{sex})")
    void insertUser(int Id,String name,int age,int sex);
}
