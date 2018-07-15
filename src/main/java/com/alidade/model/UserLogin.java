package com.alidade.model;

import javax.persistence.*;

@Entity
public class UserLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String email;

    private String password;
}
