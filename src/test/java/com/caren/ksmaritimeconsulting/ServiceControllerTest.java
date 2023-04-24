// package com.caren.ksmaritimeconsulting;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.Mockito.when;

// import java.util.ArrayList;

// import org.hibernate.mapping.List;
// import org.hibernate.service.Service;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
// import org.springframework.boot.test.mock.mockito.MockBean;
// import org.springframework.mock.web.MockHttpServletResponse;
// import org.springframework.security.test.context.support.WithMockUser;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

// import com.caren.ksmaritimeconsulting.controllers.ServiceController;
// import com.caren.ksmaritimeconsulting.models.ServiceModel;
// import com.caren.ksmaritimeconsulting.services.ServiceService;
// import com.fasterxml.jackson.databind.ObjectMapper;

// @WebMvcTest(value = ServiceController.class)
// public class ServiceControllerTest<ServiceModel> {
// @Autowired
// MockMvc mockMvc;

// @MockBean
// ServiceService service;

// @Autowired
// ObjectMapper mapper;

// @Test
// @WithMockUser("serviceTest")
// public void testRetrieveAllServices() throws Exception {

// List<ServiceModel> services = new ArrayList<Service>();
// ServiceModel serviceModel1 = new ServiceModel();
// ServiceModel serviceModel2 = new ServiceModel();

// services.add(serviceModel1);
// services.add(serviceModel2);

// when(service.listAll()).thenReturn(services);
// MockHttpServletResponse response =
// this.mockMvc.perform(MockMvcRequestBuilders.get("/api/services"))
// .andExpect(status().isOk())
// .andReturn()
// .getResponse();

// System.out.println(response.getContentAsString());

// assertEquals(response.getStatus(), 200);

// assertEquals(response.getContentAsString(null),
// mapper.writeValueAsString(services));

// }
// }
