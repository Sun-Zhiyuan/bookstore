package com.example.bookstore.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BPReturn {
    @Update("UPDATE people,bookofpeople \n" +
            "SET people.money = people.money + bookofpeople.bpprice \n" +
            "where people.id  = #{peopleId} and bookofpeople.bookId  = #{bookId}")
    void ReturnBook(Integer peopleId,Integer bookId);

    @Update("UPDATE people,bookofpeople \n" +
            "SET people.money = people.money + bookofpeople.bpdiscount \n" +
            "where people.id  = #{peopleId} and bookofpeople.bookId  = #{bookId}")
    void ReturnVipBook(Integer peopleId,Integer bookId);

    @Insert("INSERT INTO book(id,name,author,price,discount) \n" +
            "            values (#{bookId},(SELECT bookname\n" +
            "                       FROM bookofpeople \n" +
            "                       WHERE bookId = #{bookId}),\n" +
            "                    (SELECT bookauthor \n" +
            "                     FROM bookofpeople \n" +
            "                     WHERE bookId = #{bookId}),\n" +
            "                    (SELECT bpprice \n" +
            "                     FROM bookofpeople \n" +
            "                     WHERE bookId = #{bookId}),\n" +
            "                     (SELECT bpdiscount \n" +
            "                     FROM bookofpeople \n" +
            "                     WHERE bookId = #{bookId})\n" +
            "                   )")
    void ReturnPrice(Integer bookId);

    @Delete("DELETE FROM bookofpeople \n" +
            "WHERE peopleId = #{peopleId} AND bookId = #{bookId}")
    void DeleteBook(Integer peopleId,Integer bookId);
}
