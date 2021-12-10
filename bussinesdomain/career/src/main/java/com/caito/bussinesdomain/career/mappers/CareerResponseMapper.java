package com.caito.bussinesdomain.career.mappers;

import com.caito.bussinesdomain.career.entity.Career;
import com.caito.bussinesdomain.career.models.dto.CareerResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CareerResponseMapper {

    CareerResponse careerToCareerResponse(Career career);
    List<CareerResponse> careerListToCareerResponseList(List<Career> careers);
}
