package com.caito.bussinesdomain.pavillon.mappers;

import com.caito.bussinesdomain.pavillon.entity.Pavillon;
import com.caito.bussinesdomain.pavillon.models.dto.PavillonRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-10T10:28:53-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11 (Oracle Corporation)"
)
@Component
public class PavillonRequestMapperImpl implements PavillonRequestMapper {

    @Override
    public Pavillon pavillonRequestToPavillon(PavillonRequest request) {
        if ( request == null ) {
            return null;
        }

        Pavillon pavillon = new Pavillon();

        pavillon.setName( request.getName() );
        pavillon.setAddress( request.getAddress() );
        pavillon.setBlackboardType( request.getBlackboardType() );

        return pavillon;
    }
}
