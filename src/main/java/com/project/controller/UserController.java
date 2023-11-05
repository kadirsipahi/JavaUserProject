package com.project.controller;

import com.project.entity.User;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-controller")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/save/{name}/{password}")
    public void save(@PathVariable String name, @PathVariable String password){
        userService.save(name, password);
    }

    @GetMapping("/find/{id}")
    public User findById(@PathVariable Long id){
        return userService.findById(id);
    }
}

