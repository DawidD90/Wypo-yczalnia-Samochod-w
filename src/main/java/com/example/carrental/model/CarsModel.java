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

    @Column(name = "productionYear")
    private String productionYear;

    @Column(name = "color")
    private String color;

    @Column(name = "mileage")
    private String mileage;

//tu można enuma zrobić
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private CarStatus carStatus;

    @ManyToOne
    @JoinColumn(name = "BranchModel_id")
    private BranchModel branchModel;

    @Column(name = "price")
    private String price;


}
