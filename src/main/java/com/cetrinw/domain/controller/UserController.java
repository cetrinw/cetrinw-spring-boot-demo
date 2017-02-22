package com.cetrinw.domain.controller;

import com.cetrinw.domain.dao.UserRepository;
import com.cetrinw.domain.entity.BootUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Cetrin Wang on 2017/2/21.
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/save")
    public BootUser save(String id, String name, int age) {
        return userRepository.save(new BootUser(id, name, age));
    }

    @RequestMapping("/")
    public String show(){
        return "hello world!";
    }

    public static void main(String[] args) {

    }
}
