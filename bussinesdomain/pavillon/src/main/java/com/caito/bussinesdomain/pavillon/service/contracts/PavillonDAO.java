package com.caito.bussinesdomain.pavillon.service.contracts;

import com.caito.bussinesdomain.pavillon.models.dto.PavillonRequest;
import com.caito.bussinesdomain.pavillon.models.dto.PavillonResponse;

import java.util.List;

public interface PavillonDAO {
    PavillonResponse save(PavillonRequest pavillon);
    PavillonResponse getPavillon(Long id);
    List<PavillonResponse> getAll();
    void delete(Long id);

}
