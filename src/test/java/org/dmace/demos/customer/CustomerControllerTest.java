package org.dmace.demos.customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@WebMvcTest(CustomerController.class)
class CustomerControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CustomerService service;

    @Test
    void shouldCreateMockMvc() {
        assertNotNull(mvc);
    }

    @Test
    void shouldReturnCustomersPage() throws Exception {
        mvc.perform(
            MockMvcRequestBuilders.get("/")
        )
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.view().name("customers"));
    }

    @Test
    void shouldReturnCustomers() throws Exception {
        mvc.perform(
                MockMvcRequestBuilders.get("/customers")
                    .param("draw", "1")
                    .param("columns[0].data", "id")
                    .param("columns[0].name", "")
                    .param("columns[0].searchable", "true")
                    .param("columns[0].orderable", "true")
                    .param("columns[0].search.value", "")
                    .param("columns[0].search.regex", "false")
                    .param("columns[1].data", "name")
                    .param("columns[1].name", "")
                    .param("columns[1].searchable", "true")
                    .param("columns[1].orderable", "true")
                    .param("columns[1].search.value", "")
                    .param("columns[1].search.regex", "false")
                    .param("columns[2].data", "surname")
                    .param("columns[2].name", "")
                    .param("columns[2].searchable", "true")
                    .param("columns[2].orderable", "true")
                    .param("columns[2].search.value", "")
                    .param("columns[2].search.regex", "false")
                    .param("order[0].column", "0")
                    .param("order[0].dir", "asc")
                    .param("start", "0")
                    .param("length", "10")
                    .param("search.value", "")
                    .param("search.regex", "false")
                    .param("_", "1672750414306")
            )
            .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
