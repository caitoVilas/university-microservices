package com.caito.bussinesdomain.career.controller;

import com.caito.bussinesdomain.career.models.dto.CareerRequest;
import com.caito.bussinesdomain.career.models.dto.CareerResponse;
import com.caito.bussinesdomain.career.services.impl.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/university/v1/career")
@CrossOrigin
public class CareerController {

    @Autowired
    private CareerService service;

    @PostMapping
    public ResponseEntity<CareerResponse> save(@RequestBody CareerRequest request){
        return new  ResponseEntity<CareerResponse>(service.save(request),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CareerResponse> getById(@PathVariable Long id){
        CareerResponse response = service.getById(id);
        if (response == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<CareerResponse>> getAll(){
        List<CareerResponse> responses = service.getAll();
        if (responses.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(responses);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        CareerResponse career = service.getById(id);
        if (career == null)
            return ResponseEntity.notFound().build();
        service.delete(id);
        return new  ResponseEntity(HttpStatus.OK);
    }
}
