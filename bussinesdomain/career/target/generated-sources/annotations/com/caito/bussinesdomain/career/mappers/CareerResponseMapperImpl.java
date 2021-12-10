package com.caito.bussinesdomain.career.mappers;

import com.caito.bussinesdomain.career.entity.Career;
import com.caito.bussinesdomain.career.models.dto.CareerResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-08T17:11:38-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11 (Oracle Corporation)"
)
@Component
public class CareerResponseMapperImpl implements CareerResponseMapper {

    @Override
    public CareerResponse careerToCareerResponse(Career career) {
        if ( career == null ) {
            return null;
        }

        CareerResponse careerResponse = new CareerResponse();

        careerResponse.setId( career.getId() );
        careerResponse.setName( career.getName() );
        careerResponse.setNumSubjects( career.getNumSubjects() );
        careerResponse.setNumYears( career.getNumYears() );
        careerResponse.setPavillon_id( career.getPavillon_id() );
        careerResponse.setCreated( career.getCreated() );
        careerResponse.setUpdated( career.getUpdated() );

        return careerResponse;
    }

    @Override
    public List<CareerResponse> careerListToCareerResponseList(List<Career> careers) {
        if ( careers == null ) {
            return null;
        }

        List<CareerResponse> list = new ArrayList<CareerResponse>( careers.size() );
        for ( Career career : careers ) {
            list.add( careerToCareerResponse( career ) );
        }

        return list;
    }
}
