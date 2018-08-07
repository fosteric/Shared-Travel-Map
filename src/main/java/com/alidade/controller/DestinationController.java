package com.alidade.controller;

import com.alidade.repository.DestinationRepository;
import com.alidade.model.Destination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.alidade.config.DestinationApis.DESTINATION_BASE_URL;
import static com.alidade.config.DestinationApis.DESTINATION_BY_ID;

@RestController
@CrossOrigin
public class DestinationController {

    @Autowired
    private DestinationRepository destinationRepository;

    @PostMapping(path = DESTINATION_BASE_URL)
    public Destination createDestination(@RequestBody Destination destination){
        return destinationRepository.saveAndFlush(destination);
    }

    @GetMapping(path = DESTINATION_BY_ID)
    public Optional<Destination> getDestinationById(@PathVariable Long id){
        return destinationRepository.findById(id);
    }

    @GetMapping(path = DESTINATION_BASE_URL)
    public List<Destination> getAllDestinations(){
        return destinationRepository.findAll();
    }

}
