package fr.campus.discoverySpring.campus.helloworld.service;

import fr.campus.discoverySpring.campus.helloworld.repository.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

import java.util.ArrayList;

@Data
@Service
public class EmployeeService {

    @Autowired
    private Employee employee;

    public Iterable<Employee> getEmployees() {
        int elementNumber = employee.getNumberEmployee();
        ArrayList<Employee> it = new ArrayList<>(elementNumber);

        for(int i=0;i<elementNumber;i++) {
            employee.setElementFromData(i);
            it.add(employee);
        }

        return it;
    }
}
