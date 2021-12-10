package com.caito.bussinesdomain.career.services.contracts;

import com.caito.bussinesdomain.career.models.dto.CareerRequest;
import com.caito.bussinesdomain.career.models.dto.CareerResponse;

import java.util.List;

public interface CareerDTO {

    CareerResponse save(CareerRequest request);
    CareerResponse getById(Long id);
    List<CareerResponse> getAll();
    void delete(Long id);
}
