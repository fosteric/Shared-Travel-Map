package com.alidade.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class Map {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MAP_ID")
    private Long id;
    private List<Destination> destinations;
}
