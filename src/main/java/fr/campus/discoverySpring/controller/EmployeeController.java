package fr.campus.discoverySpring.controller;

import fr.campus.discoverySpring.repository.Employee;
import fr.campus.discoverySpring.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeInteraction;

    @GetMapping("/employees")
    public Iterable<Employee> getEmployees(){

        return employeeInteraction.getEmployees();
    }
}
