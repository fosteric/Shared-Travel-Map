package com.alidade.model;

import javax.persistence.*;

@Entity
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DESTINATION_ID")
    private Long id;
    private String city;
    private String state;
    private String startDate;
    private String endDate;
    private String travelType;
    private String favoriteThing;
    private String notes;

}
