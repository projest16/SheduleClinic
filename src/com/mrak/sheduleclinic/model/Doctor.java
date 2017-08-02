package com.mrak.sheduleclinic.model;

import javax.persistence.*;

@Entity
@Table(name = "Doctor")
public class Doctor {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String patronymic;

    @Column
    private String position;
}
