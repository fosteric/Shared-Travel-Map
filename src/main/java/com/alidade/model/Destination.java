package com.alidade.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DESTINATION")
@Getter @Setter
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DESTINATION_ID")
    private Long id;

    @Column(name = "DESTINATION_STATE")
    private String destinationState;

    @Column(name = "CITY")
    private String city;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "TRAVEL_TYPE")
    private String travelType;

    @Column(name = "FAVORITE_THING")
    private String favoriteThing;

    @Column(name = "NOTES")
    private String notes;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PROFILE_ID", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Profile profile;

}
