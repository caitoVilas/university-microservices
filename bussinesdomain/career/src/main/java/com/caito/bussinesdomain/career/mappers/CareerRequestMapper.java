package com.caito.bussinesdomain.career.mappers;

import com.caito.bussinesdomain.career.entity.Career;
import com.caito.bussinesdomain.career.models.dto.CareerRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CareerRequestMapper {

    Career careerRequestToCareer(CareerRequest request);
}
