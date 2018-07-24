package com.alidade.controller;

import com.alidade.model.Login;
import com.alidade.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/v1/")
@CrossOrigin
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

    @RequestMapping(value = "users/login/{id}", method = RequestMethod.GET)
    public Login get(@PathVariable Long id) {
        return loginRepository.findOne(id);
    }
}
