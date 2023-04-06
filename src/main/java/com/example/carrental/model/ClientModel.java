package com.example.carrental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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

    @Column(name = "email")
    private String Email;
    @Column(name = "address")
    private String Address;

    @OneToMany(mappedBy="clientModel")
 private List<ReservationModel> reservationModel;


}

