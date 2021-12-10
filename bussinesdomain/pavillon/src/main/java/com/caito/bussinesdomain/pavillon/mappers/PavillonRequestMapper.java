package com.caito.bussinesdomain.pavillon.mappers;

import com.caito.bussinesdomain.pavillon.entity.Pavillon;
import com.caito.bussinesdomain.pavillon.models.dto.PavillonRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PavillonRequestMapper {

    Pavillon pavillonRequestToPavillon(PavillonRequest request);
}
