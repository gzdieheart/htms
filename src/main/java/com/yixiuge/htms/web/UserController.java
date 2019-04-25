package com.yixiuge.htms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yixiuge.htms.domain.User;
import com.yixiuge.htms.domain.UserMapper;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUser")
    public User getUser(String id) {
        if (id == null) {
            id = "";
        }
        User user = userMapper.getById(id);
        return user;
    }

    @RequestMapping("/saveUser")
    public User saveUser(User user) {
        userMapper.save(user);
        return user;
    }

}