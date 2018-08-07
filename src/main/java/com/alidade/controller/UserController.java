package com.alidade.controller;

import com.alidade.model.User;
import com.alidade.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static com.alidade.config.UserApis.USER_BASE_URL;
import static com.alidade.config.UserApis.USER_BY_ID;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = USER_BASE_URL)
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<>(userRepository.saveAndFlush(user), HttpStatus.CREATED);
    }

    @GetMapping(value = USER_BY_ID)
    public Optional<User> getUserById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

}
