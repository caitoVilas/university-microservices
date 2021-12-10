package com.caito.bussinesdomain.pavillon.mappers;

import com.caito.bussinesdomain.pavillon.entity.Pavillon;
import com.caito.bussinesdomain.pavillon.models.dto.PavillonResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PavillonResponseMapper {

    PavillonResponse pavillonToPavillonResponse(Pavillon pavillon);

    List<PavillonResponse> pavillonListToPavillonResponseList(List<Pavillon> pavillons);
}
