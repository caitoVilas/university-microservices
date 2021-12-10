package com.caito.bussinesdomain.career.models.dto;

import com.caito.bussinesdomain.career.constants.ErrorMessajes;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
public class CareerRequest {

    @NotNull(message = ErrorMessajes.MSG_CAREER_NULL)
    @NotBlank(message = ErrorMessajes.MSG_CAREER_EMPTY)
    @Size(max = 80, message = ErrorMessajes.MSG_CAREER_EMPTY)
    private String name;
    @Positive(message = ErrorMessajes.MSG_CAREER_POSITIVE)
    private Integer numSubjects;
    @Positive
    private Integer numYears;
    @Positive
    private Long pavillon_id;
}
