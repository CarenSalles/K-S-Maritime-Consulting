package com.caren.ksmaritimeconsulting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caren.ksmaritimeconsulting.models.ServiceModel;

public interface ServiceRepository extends JpaRepository<ServiceModel, Long> {

}
