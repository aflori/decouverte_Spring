package fr.campus.discoverySpring.controller;

import fr.campus.discoverySpring.repository.Employee;
import fr.campus.discoverySpring.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeInteraction;

    @GetMapping("/employees/{id}")
    public Iterable<Employee> getEmployees(@PathVariable(required = false) String id) {
        return this.getListEmployerFromId(id);
    }

    @GetMapping("/emploi")
    public Iterable<Employee> getEmployee(@RequestParam(name = "id", required = false, defaultValue = "-1") String id) {
        return this.getListEmployerFromId(id);
    }

    private Iterable<Employee> getListEmployerFromId(String id){
        int id2;
        try {
            id2 = Integer.parseInt(id);
        } catch (Exception ignore) {
            id2 = -1;
        }
        return employeeInteraction.getEmployees(id2);
    }
}
