// package com.caren.ksmaritimeconsulting;

// import static org.assertj.core.api.Assertions.assertThat;
// import static org.mockito.Mockito.when;
// import static
// org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
// import static
// org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// import java.security.Provider.Service;
// import java.util.ArrayList;

// import org.apache.tomcat.util.http.parser.MediaType;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import
// org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
// import org.springframework.boot.test.mock.mockito.MockBean;
// import org.springframework.http.HttpStatus;
// import org.springframework.mock.web.MockHttpServletResponse;
// import org.springframework.test.web.servlet.MockMvc;

// import com.caren.ksmaritimeconsulting.controllers.ServiceController;
// import com.caren.ksmaritimeconsulting.services.ServiceService;
// import com.fasterxml.jackson.databind.ObjectMapper;

// import antlr.collections.List;

// @WebMvcTest(value = ServiceController.class)
// @AutoConfigureMockMvc(addFilters = false)
// public class ServiceControllerTest {

// @Autowired
// private MockMvc MockMvc;

// @Autowired
// private ObjectMapper objectMapper;

// @MockBean
// private ServiceService serviceM;

// @Test
// void testIndex_should_return_list_of_services() throws Exception {
// List<Service> List = new ArrayList<>();
// Service service1 = new Service("DP Basic Course");
// Service service2 = new Service("Manual and pulications translation");
// service1.setId(1L);
// service2.setId(2L);
// List.add(service1);
// List.add(service2);

// when(serviceM.index()).thenReturn(List);
// MockHttpServletResponse response = MockMvc.perform(get("/api/services")
// .accept(MediaType.APPLICATION_JSON))
// .andExpect(status().isOk())
// .andReturn()
// .getResponse();

// assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
// assertThat(response.getContentAsString()).contains("DP Basic Course");
// }

// }
