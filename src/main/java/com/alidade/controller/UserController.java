package com.alidade.controller;

import com.alidade.model.User;
import com.alidade.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/v1/")
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //CREATE
    @RequestMapping(value = "users", method = RequestMethod.POST)
    public ResponseEntity<User> create(@RequestBody User user){
        return new ResponseEntity<>(userRepository.saveAndFlush(user), HttpStatus.CREATED);
    }

    //READ
    @RequestMapping(value = "users/{id}", method = RequestMethod.GET)
    public User get(@PathVariable Long id) {
        return userRepository.findOne(id);
    }

}
