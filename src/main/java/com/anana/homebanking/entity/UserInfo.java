package com.anana.homebanking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_info")
public class UserInfo {

    @Id
    private Long dni;
    private String name;
    private String lastname;
    private String celular;
    private String provincia;
    private String  municipio;
    private String email;
    @OneToOne
    UserDetailsEntity userDetailsEntity;


}
