package fr.campus.discoverySpring.campus.helloworld.repository;


import fr.campus.discoverySpring.campus.helloworld.model.DataBase;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Employee {

    @Autowired
    private DataBase datas;

    private String firstName;
    private String lastName;
    private String mail;
    private String password;

    public Employee() {
    }

    public void setElementFromData(int i) {

        String[] element = this.datas.getElement(i);

        this.firstName = element[0];
        this.lastName = element[1];
        this.mail = element[2];
        this.password = element[3];
    }

    public int getNumberEmployee() {

        return datas.size();
    }
}
