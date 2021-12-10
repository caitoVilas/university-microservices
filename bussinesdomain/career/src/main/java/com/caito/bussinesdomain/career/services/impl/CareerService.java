package com.caito.bussinesdomain.career.services.impl;

import com.caito.bussinesdomain.career.entity.Career;
import com.caito.bussinesdomain.career.mappers.CareerRequestMapper;
import com.caito.bussinesdomain.career.mappers.CareerResponseMapper;
import com.caito.bussinesdomain.career.models.dto.CareerRequest;
import com.caito.bussinesdomain.career.models.dto.CareerResponse;
import com.caito.bussinesdomain.career.repository.CareerRepository;
import com.caito.bussinesdomain.career.services.contracts.CareerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CareerService implements CareerDTO {

    @Autowired
    private CareerRepository repository;
    @Autowired
    private CareerRequestMapper requestMapper;
    @Autowired
    private CareerResponseMapper responseMapper;


    @Override
    public CareerResponse save(CareerRequest request) {
        Career career = repository.save(requestMapper.careerRequestToCareer(request));
        return responseMapper.careerToCareerResponse(career);
    }

    @Override
    public CareerResponse getById(Long id) {
        Career career = repository.findById(id).orElse(null);
        if (career == null)
            return null;
        return responseMapper.careerToCareerResponse(career);
    }

    @Override
    public List<CareerResponse> getAll() {
        List<Career> careers = repository.findAll();
        return responseMapper.careerListToCareerResponseList(careers);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
