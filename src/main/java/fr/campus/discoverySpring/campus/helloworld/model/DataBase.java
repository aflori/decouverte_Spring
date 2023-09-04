package fr.campus.discoverySpring.campus.helloworld.model;

import lombok.Getter;
import org.springframework.stereotype.Component;


@Component
public class DataBase {
    @Getter
    private final String[] namesField;
    private final String[][] nameValues;

    public DataBase() {
        this.namesField = new String[]{"first_name", "last_name", "mail", "password"};
        this.nameValues = new String[][]{
                {"Laurent", "GINA", "laurentgina@mail.com", "laurent"},
                {"Sophie", "FONCEK", "sophiefoncek@mail.com", "sophie"},
                {"Agathe", "FEELING", "agathefeeling@mail.com", "agathe"}
        };
    }

    public int size() {
        return this.nameValues.length;
    }

    public String[] getElement(int i) {
        return  this.nameValues[i];
    }
}
