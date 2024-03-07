package com.example.bookstore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface Overdue {
    @Update("UPDATE bookofpeople \n" +
            "set overdue = true\n" +
            "where peopleId = #{peopleId}")
    void Overdue(Integer peopleId);
}
