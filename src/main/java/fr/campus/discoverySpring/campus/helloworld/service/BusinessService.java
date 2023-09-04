package fr.campus.discoverySpring.campus.helloworld.service;

import org.springframework.stereotype.Component;

import fr.campus.discoverySpring.campus.helloworld.model.HelloWorld;

@Component
public class BusinessService {

    public HelloWorld getHelloWorld() {
        HelloWorld hello = new HelloWorld();
        return hello;
    }
}
