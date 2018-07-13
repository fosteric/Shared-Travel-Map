package com.alidade.controller;

import com.alidade.model.User;
import com.alidade.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    //CREATE
    @RequestMapping(value = "users", method = RequestMethod.POST)
    public User create(@RequestBody User user){
        return userRepository.saveAndFlush(user);
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
