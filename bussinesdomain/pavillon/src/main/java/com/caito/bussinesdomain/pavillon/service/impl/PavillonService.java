package com.caito.bussinesdomain.pavillon.service.impl;

import com.caito.bussinesdomain.pavillon.entity.Pavillon;
import com.caito.bussinesdomain.pavillon.mappers.PavillonRequestMapper;
import com.caito.bussinesdomain.pavillon.mappers.PavillonResponseMapper;
import com.caito.bussinesdomain.pavillon.models.dto.PavillonRequest;
import com.caito.bussinesdomain.pavillon.models.dto.PavillonResponse;
import com.caito.bussinesdomain.pavillon.repository.PavillonRepository;
import com.caito.bussinesdomain.pavillon.service.contracts.PavillonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PavillonService implements PavillonDAO {

    @Autowired
    private PavillonRepository repository;
    @Autowired
    PavillonRequestMapper requestMapper;
    @Autowired
    PavillonResponseMapper responseMapper;


    @Override
    public PavillonResponse save(PavillonRequest pavillon) {
        Pavillon pavillonnew = requestMapper.pavillonRequestToPavillon(pavillon);

        return responseMapper.pavillonToPavillonResponse(repository.save(pavillonnew));
    }

    @Override
    public PavillonResponse getPavillon(Long id) {
       Pavillon pavillon = repository.findById(id).orElse(null);
       return responseMapper.pavillonToPavillonResponse(pavillon);
    }

    @Override
    public List<PavillonResponse> getAll() {
        return responseMapper.pavillonListToPavillonResponseList(repository.findAll());
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
