package com.alidade.controller;

import com.alidade.model.User;
import com.alidade.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
@RequestMapping(path="api/v1/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //CREATE
    @RequestMapping(value = "users", method = RequestMethod.POST)
    public ResponseEntity<User> create(@RequestBody User user){
        return new ResponseEntity<User>(userRepository.saveAndFlush(user),HttpStatus.CREATED);
    }

    //READ
    @RequestMapping(value = "users/{id}", method = RequestMethod.GET)
    public User get(@PathVariable Long id){
        return userRepository.findOne(id);
    }

    //UPDATE
    @RequestMapping(value = "users/{id}", method = RequestMethod.PUT)
    public User update(@PathVariable Long id, @RequestBody User user){
        User userToUpdate = userRepository.findOne(id);
        BeanUtils.copyProperties(user, userToUpdate);
        return userRepository.saveAndFlush(userToUpdate);
    }

    //DELETE
    @RequestMapping(value = "users/{id}", method = RequestMethod.DELETE)
    public User delete(@PathVariable Long id){
        User userToDelete = userRepository.findOne(id);
        userRepository.delete(userToDelete);
        return userToDelete;
    }



}
