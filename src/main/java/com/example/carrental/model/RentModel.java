package com.example.carrental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "internet_domain")
    private String internetDomain;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "owner")
    private String owner;

    @Column(name = "logotype")
    private String logotype;

    @Column(name = "branches")
    private String branches;

}
