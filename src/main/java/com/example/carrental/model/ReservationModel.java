package com.example.carrental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReservationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "reservation_date")
    private Date reservationDate;


    @Column(name = "client")
    private String client;

    @Column(name = "car")
    private String car;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "reservation_from")
    private Date reservationFrom;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "reservation_to")
    private Date reservationTo;

    @Column(name = "rent_branch")
    private String Branchmodel;

    @Column(name = "return_branch")
    private String returnBranch;


    @Column(name = "sum")
    private float sum;

    @ManyToOne
    @JoinColumn(name = "CarsModel_id")
    private CarsModel carsModel;

@ManyToOne
@JoinColumn(name = "ClientModel_id")
private ClientModel clientModel;


}
