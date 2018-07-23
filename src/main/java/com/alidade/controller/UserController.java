package com.alidade.controller;

import com.alidade.model.Profile;
import com.alidade.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/v1/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //CREATE
    @RequestMapping(value = "users", method = RequestMethod.POST)
    public ResponseEntity<Profile> create(@RequestBody Profile profile){
        return new ResponseEntity<Profile>(userRepository.saveAndFlush(profile),HttpStatus.CREATED);
    }

    //READ
    @RequestMapping(value = "users/{id}", method = RequestMethod.GET)
    public Profile get(@PathVariable Long id){
        return userRepository.findOne(id);
    }

    //UPDATE
    @RequestMapping(value = "users/{id}", method = RequestMethod.PUT)
    public Profile update(@PathVariable Long id, @RequestBody Profile profile){
        Profile profileToUpdate = userRepository.findOne(id);
        BeanUtils.copyProperties(profile, profileToUpdate);
        return userRepository.saveAndFlush(profileToUpdate);
    }

    //DELETE
    @RequestMapping(value = "users/{id}", method = RequestMethod.DELETE)
    public Profile delete(@PathVariable Long id){
        Profile profileToDelete = userRepository.findOne(id);
        userRepository.delete(profileToDelete);
        return profileToDelete;
    }



}
