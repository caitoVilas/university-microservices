package com.caito.bussinesdomain.pavillon.entity;

import com.caito.bussinesdomain.pavillon.models.Address;
import com.caito.bussinesdomain.pavillon.models.enums.BlackboardType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pavillons")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pavillon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 80)
    private String name;
    @Embedded
    private Address address;
    /*@Column(nullable = false, length = 80)
    private String address;
    @Column(nullable = false, length = 80)
    private String location;
    @Column(length = 10)
    private String postalcode;*/
    @Enumerated(EnumType.STRING)
    private BlackboardType blackboardType;
}
