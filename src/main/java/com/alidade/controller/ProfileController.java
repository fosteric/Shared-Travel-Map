package com.alidade.controller;

import com.alidade.model.Profile;
import com.alidade.repository.ProfileRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/v1/")
@CrossOrigin
public class ProfileController {

    @Autowired
    private ProfileRepository profileRepository;

    //CREATE
    @RequestMapping(value = "users/profiles", method = RequestMethod.POST)
    public ResponseEntity<Profile> create(@RequestBody Profile profile){
        return new ResponseEntity<>(profileRepository.saveAndFlush(profile), HttpStatus.CREATED);
    }

    //READ
    @RequestMapping(value = "users/profiles/{id}", method = RequestMethod.GET)
    public Profile get(@PathVariable Long id){
        return profileRepository.findOne(id);
    }

    //UPDATE
    @RequestMapping(value = "users/profiles/{id}", method = RequestMethod.PUT)
    public Profile update(@PathVariable Long id, @RequestBody Profile profile){
        Profile profileToUpdate = profileRepository.findOne(id);
        BeanUtils.copyProperties(profile, profileToUpdate);
        return profileRepository.saveAndFlush(profileToUpdate);
    }

    //DELETE
    @RequestMapping(value = "users/profiles/{id}", method = RequestMethod.DELETE)
    public Profile delete(@PathVariable Long id){
        Profile profileToDelete = profileRepository.findOne(id);
        profileRepository.delete(profileToDelete);
        return profileToDelete;
    }



}
