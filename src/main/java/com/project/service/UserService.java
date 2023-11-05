package com.project.service;

import com.project.entity.User;
import com.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(String name, String password){
        User newUser = new User();
        newUser.setName(name);
        newUser.setPassword(password);
        userRepository.save(newUser);
    }

    public User findById(Long id){
        User fromDb = userRepository.findById(id).get();
        return fromDb;
    }
}
