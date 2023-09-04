package fr.campus.discoverySpring.campus.helloworld.view;

import fr.campus.discoverySpring.campus.helloworld.model.HelloWorld;
import fr.campus.discoverySpring.campus.helloworld.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class externalRun implements CommandLineRunner {

    @Autowired
    private BusinessService bs;


    @Override
    public void run(String... args){
        HelloWorld hw = bs.getHelloWorld();
        System.out.println(hw);
    }
}
