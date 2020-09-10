package com.anana.homebanking.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "user_account")
@Getter
public class UserAccount {

    @Id
    private UUID cbu;
    @Column(name = "caja_ahorro_pesos")
    private Double cajaAhorroPesos;
    @Column(name = "caja_ahorro_dolares")
    private Double cajaAhorroDolares;
    private Double bitcoins;
    @OneToOne
    private UserDetailsEntity userDetailsEntity;

}
