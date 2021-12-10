package com.caito.bussinesdomain.career.mappers;

import com.caito.bussinesdomain.career.entity.Career;
import com.caito.bussinesdomain.career.models.dto.CareerRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-08T17:11:38-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11 (Oracle Corporation)"
)
@Component
public class CareerRequestMapperImpl implements CareerRequestMapper {

    @Override
    public Career careerRequestToCareer(CareerRequest request) {
        if ( request == null ) {
            return null;
        }

        Career career = new Career();

        career.setName( request.getName() );
        career.setNumSubjects( request.getNumSubjects() );
        career.setNumYears( request.getNumYears() );
        career.setPavillon_id( request.getPavillon_id() );

        return career;
    }
}
