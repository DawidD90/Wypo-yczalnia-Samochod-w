package com.example.carrental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
