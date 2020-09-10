package com.anana.homebanking.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "user_details")
@Getter
public class UserDetailsEntity {

    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String password;
    private String roles;
    private boolean enabled;
    @OneToOne(mappedBy = "userDetailsEntity")
    private UserAccount userAccount;
    @OneToOne(mappedBy = "userDetailsEntity")
    private UserInfo userInfo;
}
