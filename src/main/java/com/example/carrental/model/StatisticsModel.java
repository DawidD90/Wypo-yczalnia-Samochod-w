package com.example.carrental.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class StatisticsModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;

        @Column(name = "title")
        private String title;

        @Column(name = "sub_title")
        private String subTitle;

        @Column(name = "description")
        private String description;


        @Column(name = "date_from")
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private Date dateFrom;


        @Column(name = "date_to")
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private Date dateTo;
}

