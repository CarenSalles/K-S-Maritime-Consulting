package com.caren.ksmaritimeconsulting.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.caren.ksmaritimeconsulting.models.ServiceModel;
import com.caren.ksmaritimeconsulting.repositories.ServiceRepository;

@Service
public class ServiceService {

    private ServiceRepository repository;

    public ServiceService(ServiceRepository repository) {
        this.repository = repository;
    }

    public List<ServiceModel> getAll() {
        return repository.findAll();
    }

    public ServiceModel findById(Long idService) {
        return repository.findById(idService).orElse(null);
    }

    public ServiceModel save(ServiceModel serviceModel) {
        ServiceModel serviceModelSaved = repository.save(serviceModel);
        return serviceModelSaved;
    }

    public ServiceModel update(ServiceModel serviceModel, Long id) {
        ServiceModel serviceModelCurrent = repository.findById(id).orElseThrow();

        serviceModelCurrent.setName(serviceModel.getName());
        serviceModelCurrent.setDescription(serviceModel.getDescription());

        return repository.save(serviceModelCurrent);
    }

    public List<ServiceModel> delete(long idService) {

        ServiceModel serviceToDelete = repository.findById(idService).orElse(null);
        repository.delete(serviceToDelete);
        return repository.findAll();
    }
}
