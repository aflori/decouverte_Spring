package fr.campus.discoverySpring.campus.helloworld;

import fr.campus.discoverySpring.campus.helloworld.model.HelloWorld;
import fr.campus.discoverySpring.campus.helloworld.service.BusinessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private BusinessService bs;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args){
        HelloWorld hw = bs.getHelloWorld();
        System.out.println(hw);
    }

    public BusinessService getBs() {
        return bs;
    }

    public void setBs(BusinessService bs) {
        this.bs = bs;
    }

}
