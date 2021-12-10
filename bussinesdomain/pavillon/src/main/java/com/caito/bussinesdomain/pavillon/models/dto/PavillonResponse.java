package com.caito.bussinesdomain.pavillon.models.dto;

import com.caito.bussinesdomain.pavillon.models.Address;
import com.caito.bussinesdomain.pavillon.models.enums.BlackboardType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PavillonResponse {

    private Long id;
    private String name;
    @Embedded
    private Address address;
    private BlackboardType blackboardType;
}
