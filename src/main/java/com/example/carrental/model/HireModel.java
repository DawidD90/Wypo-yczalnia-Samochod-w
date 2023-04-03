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
public class HireModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "employee")
    private String employee;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "rent_date")
    private Date rentDate;


    //powstaje na podstawie rezerwacji
    @Column(name = "reservation")
    private String reservation;

    @Column(name = "supplement")
    private float supplement;

    @Column(name = "comments")
    private String comments;

}
