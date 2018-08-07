package com.alidade.controller;

import com.alidade.model.Login;
import com.alidade.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static com.alidade.config.LoginApis.LOGIN_BASE_URL;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

    @GetMapping(path = LOGIN_BASE_URL)
    public Optional<Login> getLoginById(@PathVariable Long id) {
        return loginRepository.findById(id);
    }
}
