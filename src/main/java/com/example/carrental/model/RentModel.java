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
public class RentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "rent_date")
    private Date rentDate;

    @Column(name = "comments")
    private String comments;

    @OneToOne(mappedBy = "rentModel")
    private ReservationModel reservationModel;

    @ManyToOne
    @JoinColumn(name = "EmployeesModel_id")
    private EmployeesModel employeesModel;
            ;
}
