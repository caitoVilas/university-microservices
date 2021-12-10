package com.caito.bussinesdomain.pavillon.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {

    @Column(length = 40)
    private String street;
    @Column(length = 5)
    private String number;
    @Column(length = 10)
    private String postalcode;
    @Column(length = 3)
    private String dpto;
    @Column(length = 2)
    private String floor;
    @Column(length = 80)
    private String location;
}
