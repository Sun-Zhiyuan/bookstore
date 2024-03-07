package com.example.bookstore.controller;

import com.example.bookstore.entity.Book;
import com.example.bookstore.entity.bookofpeople;
import com.example.bookstore.mapper.BPBuy;
import com.example.bookstore.mapper.BPMapper;
import com.example.bookstore.mapper.BPReturn;
import com.example.bookstore.mapper.Overdue;
import com.example.bookstore.repository.BookPeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin
public class PeopleBookHandler {

    @Autowired
    private BPMapper bpMapper;
    @RequestMapping("/findByUser/{Id}")
    public List<bookofpeople> find(@PathVariable("Id") Integer Id){
        return bpMapper.selectByUser(Id);
    }

    @RequestMapping("/findByUser")
    public List<bookofpeople> findAll(){
        return bpMapper.FindAll();
    }

    @Autowired
    private BPBuy bpBuy;
    @GetMapping("/BuyBook/{peopleId}/{Id}")
    public void Buy(@PathVariable("peopleId") Integer peopleId,@PathVariable("Id") Integer Id) {
        bpBuy.BuyBook(peopleId,Id);
    }
    @GetMapping("/{peopleId}/{bookId}")
    public void InsertBP(@PathVariable("peopleId") Integer peopleId,@PathVariable("bookId") Integer bookId){
        bpBuy.InsertBP(peopleId,bookId);
    }

    @Autowired
    private BPReturn bpReturn;
    @GetMapping("/ReturnBook/{peopleId}/{bookId}")
    public void ReturnBook(@PathVariable("peopleId")Integer peopleId,@PathVariable("bookId") Integer bookId){
        bpReturn.ReturnBook(peopleId,bookId);
    }
    @GetMapping("/ReturnPrice/{bookId}")
    public void ReturnPrice(@PathVariable("bookId")Integer bookId){
        bpReturn.ReturnPrice(bookId);
    }
    @GetMapping("DeleteBook/{peopleId}/{bookId}")
    public void DeleteBook(@PathVariable("peopleId")Integer peopleId,@PathVariable("bookId")Integer bookId){
        bpReturn.DeleteBook(peopleId,bookId);
    }
    @GetMapping("/BuyVipBook/{peopleId}/{Id}")
    public void BuyVipBook(@PathVariable("peopleId") Integer peopleId,@PathVariable("Id") Integer Id) {
        bpBuy.BuyVipBook(peopleId,Id);
    }
    @GetMapping("/ReturnVipBook/{peopleId}/{bookId}")
    public void ReturnVipBook(@PathVariable("peopleId")Integer peopleId,@PathVariable("bookId") Integer bookId){
        bpReturn.ReturnVipBook(peopleId,bookId);
    }

    @Autowired
    private Overdue overdue;
    @GetMapping("/overdue/{peopleId}")
    public void Overdue(@PathVariable("peopleId")Integer peopleId){
        overdue.Overdue(peopleId);
    }
}



