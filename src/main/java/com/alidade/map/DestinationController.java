package com.alidade.map;

import com.alidade.map.Destination;
import com.alidade.map.DestinationRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/")
@CrossOrigin
public class DestinationController {

    @Autowired
    private DestinationRepository destinationRepository;

    //CREATE
    @RequestMapping(value = "destinations", method = RequestMethod.POST)
    public Destination create(@RequestBody Destination destination){
        return destinationRepository.saveAndFlush(destination);
    }

    //READ-ONE
    @RequestMapping(value = "destinations/{id}", method = RequestMethod.GET)
    public Destination get(@PathVariable Long id){
        return destinationRepository.findOne(id);
    }

    //READ-ALL
    @RequestMapping(value = "destinations", method = RequestMethod.GET)
    public List<Destination> get(){
        return destinationRepository.findAll();
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
