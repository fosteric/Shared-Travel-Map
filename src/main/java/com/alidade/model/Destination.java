package com.alidade.model;

import javax.persistence.*;

@Entity
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String destinationType;
    private String city;
    private String country;
    private String startDate;
    private String endDate;
    private String travelType;
    private String favoriteThing;
    private String notes;

    public void setId(long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
}
