package com.caito.bussinesdomain.career.models.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CareerResponse {

    private Long id;
    private String name;
    private Integer numSubjects;
    private Integer numYears;
    private Long pavillon_id;
    private LocalDateTime created;
    private LocalDateTime updated;
}
