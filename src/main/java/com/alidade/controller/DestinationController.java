package com.alidade.controller;

import com.alidade.model.Destination;
import com.alidade.repository.DestinationRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class DestinationController {

    @Autowired
    DestinationRepository destinationRepository;

    //CREATE
    @RequestMapping(value = "destinations", method = RequestMethod.POST)
    public Destination create(@RequestBody Destination destination){
        return destinationRepository.saveAndFlush(destination);
    }

    //READ
    @RequestMapping(value = "destinations/{id}", method = RequestMethod.GET)
    public Destination get(@PathVariable Long id){
        return destinationRepository.findOne(id);
    }

    //UPDATE
    @RequestMapping(value = "destinations/{id}", method = RequestMethod.PUT)
    public Destination update(@PathVariable Long id, @RequestBody Destination destination){
        Destination destinationToUpdate = destinationRepository.findOne(id);
        BeanUtils.copyProperties(destination, destinationToUpdate);
        return destinationRepository.saveAndFlush(destinationToUpdate);
    }

    //DELETE
    @RequestMapping(value = "destinations/{id}", method = RequestMethod.DELETE)
    public Destination delete(@PathVariable Long id){
        Destination destinationToDelete = destinationRepository.findOne(id);
        destinationRepository.delete(destinationToDelete);
        return destinationToDelete;
    }

}
