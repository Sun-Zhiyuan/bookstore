package com.example.bookstore.mapper;

import com.example.bookstore.entity.bookofpeople;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface BPMapper {
    @Select("SELECT * FROM bookofpeople where peopleId = #{Id}")
    List<bookofpeople> selectByUser(Integer Id);

    @Select("SELECT * FROM bookofpeople")
    List<bookofpeople> FindAll();
}