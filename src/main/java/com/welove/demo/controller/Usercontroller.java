package com.welove.demo.controller;

import com.welove.demo.model.User;
import com.welove.demo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Usercontroller {
    @Autowired
    Userservice userservice;
    //

    @RequestMapping(value = "getUserById",method = RequestMethod.POST)
    @ResponseBody
    public User getUserById(){
        return userservice.testservice();
    }


}
