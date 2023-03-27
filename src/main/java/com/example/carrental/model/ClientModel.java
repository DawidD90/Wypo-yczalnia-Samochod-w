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
public class ClientModel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "Email")
    private String Email;
    @Column(name = "Address")
    private String Address;

}

