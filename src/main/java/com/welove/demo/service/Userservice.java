package com.welove.demo.service;

import com.welove.demo.dao.UserMapper;
import com.welove.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
    @Autowired
    UserMapper userMapper;

    public User testservice(){
        return userMapper.selectByPrimaryKey(1);
    }
}
