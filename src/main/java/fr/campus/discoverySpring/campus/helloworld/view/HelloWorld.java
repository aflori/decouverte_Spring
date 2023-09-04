package fr.campus.discoverySpring.campus.helloworld.view;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("Hello World !");
    }
}


