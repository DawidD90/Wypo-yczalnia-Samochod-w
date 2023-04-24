package com.example.carrental.Requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public class ClientRegistrationRequest {

    @Id
    private Long Id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String username;


    private String password;

    private String name;


    private String surname;


    private String Email;

    private String Address;


}
