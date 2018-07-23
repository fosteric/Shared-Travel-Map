package com.alidade.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Map {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private List<Destination> destinations;
}
