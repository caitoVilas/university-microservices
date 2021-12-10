package com.caito.bussinesdomain.pavillon.controller;

import com.caito.bussinesdomain.pavillon.models.dto.PavillonRequest;
import com.caito.bussinesdomain.pavillon.models.dto.PavillonResponse;
import com.caito.bussinesdomain.pavillon.service.impl.PavillonService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/university/v1/pavillon")
@CrossOrigin
@Api(tags = "")
public class PavillonController {

    @Autowired
    private PavillonService service;

    @PostMapping
    public ResponseEntity<PavillonResponse> save(@RequestBody PavillonRequest pavillon){
        return new ResponseEntity<PavillonResponse>(service.save(pavillon), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PavillonResponse> getById(@PathVariable Long id){
       PavillonResponse response = service.getPavillon(id);
        if (response == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<PavillonResponse>> getAll(){
        List<PavillonResponse> pavillons = service.getAll();
        if (pavillons.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(pavillons);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        PavillonResponse pavillon = service.getPavillon(id);
        if (pavillon == null)
            return ResponseEntity.notFound().build();
        service.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
