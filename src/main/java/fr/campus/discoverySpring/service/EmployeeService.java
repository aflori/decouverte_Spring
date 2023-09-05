package fr.campus.discoverySpring.service;

import fr.campus.discoverySpring.repository.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

import java.util.ArrayList;

@Data
@Service
public class EmployeeService {

    @Autowired
    private Employee employee;

    public Iterable<Employee> getEmployees(int i) {
        int elementNumber = employee.getNumberEmployee();
        ArrayList<Employee> it = new ArrayList<>(elementNumber);
        if(i<0 || i>=elementNumber) {
            for(int j=0;j<elementNumber;j++) {
                employee.setElementFromData(j);
                it.add(employee);
            }
        }
        else {
            employee.setElementFromData(i);
            it.add(employee);
        }

        return it;
    }
}
