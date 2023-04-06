package com.example.carrental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class EmployeesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "position")
    private String position;


   @ManyToOne
   @JoinColumn(name = "branchModel_id")
   private BranchModel branchModel;


   @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, mappedBy = "EmployeesModel")
   private Set<RentModel> rentModel = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, mappedBy = "EmployeesModel")
    private Set<ReturnModel> returnModel = new HashSet<>();
}
