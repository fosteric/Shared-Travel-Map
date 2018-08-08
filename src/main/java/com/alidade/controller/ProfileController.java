package com.alidade.controller;

import com.alidade.model.Profile;
import com.alidade.repository.ProfileRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

import static com.alidade.config.ProfileApis.PROFILE_BASE_URL;
import static com.alidade.config.ProfileApis.PROFILE_BY_ID;

@RestController
@CrossOrigin
public class ProfileController {

    @Autowired
    private ProfileRepository profileRepository;

    @PostMapping(value = PROFILE_BASE_URL)
    public Profile createProfile(@RequestBody Profile profile){
        return profileRepository.save(profile);
    }

    @GetMapping(value = PROFILE_BASE_URL)
    public Collection<Profile> getAllProfiles(){
        return profileRepository.findAll();
    }

    @GetMapping(value = PROFILE_BY_ID)
    public Optional<Profile> getProfileById(@PathVariable Long id){
        return profileRepository.findById(id);
    }

}
