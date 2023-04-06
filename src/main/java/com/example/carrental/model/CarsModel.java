package com.example.carrental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @Column(name = "price")
    private String price;

@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE,mappedBy="carsModel")
private Set<ReservationModel> reservationModel = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "BranchModel_id")
    private BranchModel branchModel;

}
