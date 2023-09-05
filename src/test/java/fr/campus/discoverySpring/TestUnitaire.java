package fr.campus.discoverySpring;

//import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import fr.campus.discoverySpring.controller.EmployeeController;
import fr.campus.discoverySpring.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

//tests unitaire
@WebMvcTest(controllers = EmployeeController.class)
public class TestUnitaire {

    @Autowired
    private MockMvc mockMvn;

    @MockBean
    private EmployeeService employeeService;

    @Test
    public void testGetEmployees() throws Exception {
        mockMvn.perform(get("/employees"))
                .andExpect(status().isOk());
    }
}
