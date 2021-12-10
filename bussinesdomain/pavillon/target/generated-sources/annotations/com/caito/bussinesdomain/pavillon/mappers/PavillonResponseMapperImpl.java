package com.caito.bussinesdomain.pavillon.mappers;

import com.caito.bussinesdomain.pavillon.entity.Pavillon;
import com.caito.bussinesdomain.pavillon.models.dto.PavillonResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-10T10:28:54-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11 (Oracle Corporation)"
)
@Component
public class PavillonResponseMapperImpl implements PavillonResponseMapper {

    @Override
    public PavillonResponse pavillonToPavillonResponse(Pavillon pavillon) {
        if ( pavillon == null ) {
            return null;
        }

        PavillonResponse pavillonResponse = new PavillonResponse();

        pavillonResponse.setId( pavillon.getId() );
        pavillonResponse.setName( pavillon.getName() );
        pavillonResponse.setAddress( pavillon.getAddress() );
        pavillonResponse.setBlackboardType( pavillon.getBlackboardType() );

        return pavillonResponse;
    }

    @Override
    public List<PavillonResponse> pavillonListToPavillonResponseList(List<Pavillon> pavillons) {
        if ( pavillons == null ) {
            return null;
        }

        List<PavillonResponse> list = new ArrayList<PavillonResponse>( pavillons.size() );
        for ( Pavillon pavillon : pavillons ) {
            list.add( pavillonToPavillonResponse( pavillon ) );
        }

        return list;
    }
}
