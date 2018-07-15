package com.alidade.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String firstName;
    private String lastName;
    private String homeCity;
    private String homeCountry;
    private String description;
    private String imagePath;


    public void setId(long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
}
