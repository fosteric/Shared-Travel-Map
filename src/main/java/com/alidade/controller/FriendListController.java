package com.alidade.controller;

import com.alidade.repository.FriendListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendListController {

    @Autowired
    FriendListRepository friendListRepository;
}
