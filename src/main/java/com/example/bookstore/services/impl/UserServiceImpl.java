package com.example.bookstore.services.impl;

import com.example.bookstore.entity.bookofpeople;
import com.example.bookstore.entity.muziuser;
import com.example.bookstore.mapper.BPMapper;
import com.example.bookstore.mapper.UserMapper;
import com.example.bookstore.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements userService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BPMapper bpMapper;

    @Override
    public void insertUser(muziuser muziUser) {
        userMapper.insertUser(muziUser.getId(), muziUser.getName(), muziUser.getAge(), muziUser.getSex());
    }

}
