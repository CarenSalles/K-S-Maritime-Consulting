package com.caren.ksmaritimeconsulting.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.caren.ksmaritimeconsulting.models.ServiceModel;
import com.caren.ksmaritimeconsulting.services.ServiceService;

@RestController
@RequestMapping(path = "/api/services")
public class ServiceController {
    private ServiceService service;

    public ServiceController(ServiceService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<ServiceModel> listAll() {
        return service.getAll();
    }

    @GetMapping("/{idService}")
    public ResponseEntity<ServiceModel> findById(@PathVariable Long idService) {
        ServiceModel serviceM = service.findById(idService);
        if (service != null) {
            return ResponseEntity.ok(serviceM);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<?> store(@RequestBody ServiceModel newServiceModel) {
        try {
            return ResponseEntity.ok(service.save(newServiceModel));
        } catch (Exception exception) {
            return ResponseEntity.status(400).body("Error" + exception.getMessage());
        }
    }

    @PutMapping(path = "/{idService}")
    public ResponseEntity<?> update(@RequestBody ServiceModel newService,
            @PathVariable(value = "idService") Long idService) {

        ServiceModel serviceM = service.update(newService, idService);

        return ResponseEntity.ok().body(serviceM);
    }

    @DeleteMapping("/{idservice}")
    public List<ServiceModel> delete(@PathVariable long idservice) {
        return service.delete(idservice);
    }

}
