package com.alidade.controller;

import com.alidade.repository.MessageBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageBoardController {

    @Autowired
    MessageBoardRepository messageBoardRepository;
}
