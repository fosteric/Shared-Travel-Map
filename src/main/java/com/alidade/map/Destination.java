package com.alidade.map;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String destinationState;
    private String city;
    private String country;
    private Date startDate;
    private Date endDate;
    private String travelType;
    private String favoriteThing;
    private String notes;

    public void setId(long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getDestinationState() {
        return destinationState;
    }

    public void setDestinationState(String destinationState) {
        this.destinationState = destinationState;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTravelType() {
        return travelType;
    }

    public void setTravelType(String travelType) {
        this.travelType = travelType;
    }

    public String getFavoriteThing() {
        return favoriteThing;
    }

    public void setFavoriteThing(String favoriteThing) {
        this.favoriteThing = favoriteThing;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
