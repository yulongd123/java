package com.yulong.controller;

import com.yulong.entity.User;
import com.yulong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "findById/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable Long id){
        User user =  userService.findById(id);
        return user;
    }

}
