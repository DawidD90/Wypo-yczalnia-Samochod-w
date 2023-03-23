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
public class CarsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "make")
    private String make;

    @Column(name = "model")
    private String model;

    @Column(name = "bodyType")
    private String bodyType;

    @Column(name = "ProductionYear")
    private String ProductionYear;

    @Column(name = "Color")
    private String Color;

    @Column(name = "Mileage")
    private String Mileage;

//tu można enuma zrobić
    @Column(name = "Status")
    private String Status;

    @Column(name = "Price")
    private String Price;
}
