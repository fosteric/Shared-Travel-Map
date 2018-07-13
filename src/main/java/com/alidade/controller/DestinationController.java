package com.alidade.controller;

import com.alidade.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DestinationController {

    @Autowired
    DestinationRepository destinationRepository;

}
