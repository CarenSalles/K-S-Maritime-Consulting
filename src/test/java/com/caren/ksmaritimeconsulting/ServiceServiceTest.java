package com.caren.ksmaritimeconsulting;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.security.Provider.Service;
import java.util.Optional;

import javax.naming.NameNotFoundException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.caren.ksmaritimeconsulting.models.ServiceModel;
import com.caren.ksmaritimeconsulting.repositories.ServiceRepository;
import com.caren.ksmaritimeconsulting.services.ServiceService;

@ExtendWith(MockitoExtension.class)
public class ServiceServiceTest {

    @InjectMocks
    ServiceService serviceM;

    @Mock
    ServiceRepository repository;

    @Test
    void testShow() throws NameNotFoundException {
        ServiceModel service = new ServiceModel(1L, "Pepe", "bla bla bla bla");

        when(repository.findById(1L)).thenReturn(Optional.of(service));

        ServiceModel result = serviceM.show(1L);

        assertThat(result.getName(), equalTo("Pepe"));
        assertThat(result.getId(), equalTo(1L));

    }

    @Test
    void testShowNoServiceFound() throws NameNotFoundException {

        assertThrows(NameNotFoundException.class, () -> {
            serviceM.show(1L);
        });

    }

}
