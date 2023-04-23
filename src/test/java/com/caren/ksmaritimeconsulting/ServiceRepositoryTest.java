package com.caren.ksmaritimeconsulting;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.caren.ksmaritimeconsulting.models.ServiceModel;
import com.caren.ksmaritimeconsulting.repositories.ServiceRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ServiceRepositoryTest {

    @Autowired
    ServiceRepository serviceRepository;

    @Test
    public void findById_ShouldReturnserviceWithThatId() {
        ServiceModel serviceModal = serviceRepository.findById(1L).orElseThrow(null);

        assertThat(serviceModal.getId()).isEqualTo(1L);
        assertThat(serviceModal.getName()).isEqualTo("DP Basic Course");

    }

}
