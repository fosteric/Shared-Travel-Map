package com.alidade.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class MessageBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    List<String> messages;
}
