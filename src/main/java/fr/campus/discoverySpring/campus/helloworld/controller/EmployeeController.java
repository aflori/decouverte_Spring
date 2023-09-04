package fr.campus.discoverySpring.campus.helloworld.controller;

import fr.campus.discoverySpring.campus.helloworld.repository.Employee;
import fr.campus.discoverySpring.campus.helloworld.service.EmployeeService;

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
