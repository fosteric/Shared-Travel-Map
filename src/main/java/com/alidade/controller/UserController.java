package com.alidade.controller;

import com.alidade.model.User;
import com.alidade.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping(value = USER_BY_ID)
    public Optional<User> getUserById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

}
