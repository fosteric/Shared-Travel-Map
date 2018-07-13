package com.alidade.controller;

import com.alidade.repository.MapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapController {

    @Autowired
    MapRepository mapRepository;
}
