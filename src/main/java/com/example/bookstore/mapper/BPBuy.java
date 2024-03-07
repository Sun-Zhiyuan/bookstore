package com.example.bookstore.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BPBuy {
    @Update("UPDATE people,book\n" +
            "SET people.money = people.money - book.price  \n" +
            "where people.id  = #{peopleId} and book.id  = #{Id}")
    void BuyBook(Integer peopleId,Integer Id);

    @Update("UPDATE people,bookofpeople,book \n" +
            "SET people.money = people.money - book.discount  \n" +
            "where people.id  = #{peopleId} and book.id  = #{Id}")
    void BuyVipBook(Integer peopleId,Integer Id);

    @Insert("INSERT INTO bookofpeople(peopleId,bookId,bookname,peopleName,bookauthor,bpprice,bpdiscount,overdue)\n" +
            "values(#{peopleId},#{bookId},(SELECT name\n" +
            "       FROM book \n" +
            "       WHERE id = #{bookId}),\n" +
            "       (SELECT name \n"+
            "       FROM people \n"+
            "       where Id = #{peopleId}), \n"+
            "      (SELECT author \n" +
            "      FROM book \n" +
            "      WHERE id = #{bookId}),\n" +
            "      (SELECT price\n" +
            "       FROM book \n" +
            "       WHERE id = #{bookId}),\n" +
            "      (SELECT discount \n" +
            "      FROM book \n" +
            "      WHERE id = #{bookId}),false)")
    void InsertBP(Integer peopleId,Integer bookId);


}