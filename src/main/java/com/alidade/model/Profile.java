package com.alidade.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PROFILE")
@Getter @Setter
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PROFILE_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "HOME_CITY")
    private String homeCity;

    @Column(name = "HOME_COUNTRY")
    private String homeCountry;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "IMAGE_PATH")
    private String imagePath;

    @ManyToMany
    @JoinTable(name = "FRIENDLIST",
            joinColumns = { @JoinColumn(name = "PROFILE_ID") },
            inverseJoinColumns = { @JoinColumn(name = "FRIEND_PROFILE_ID") })
    private List<Profile> friendList;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private User user;

}
