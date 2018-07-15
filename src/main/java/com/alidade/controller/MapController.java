package com.alidade.controller;

import com.alidade.repository.MapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class MapController {

    @Autowired
    MapRepository mapRepository;
}
