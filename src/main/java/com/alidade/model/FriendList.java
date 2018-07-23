package com.alidade.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class FriendList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    @OneToMany(targetEntity = User.class)
//    private List<User> friends;
}
