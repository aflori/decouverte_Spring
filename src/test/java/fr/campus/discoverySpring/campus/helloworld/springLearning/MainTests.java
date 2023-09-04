package fr.campus.discoverySpring.campus.helloworld.springLearning;

import fr.campus.discoverySpring.campus.helloworld.model.HelloWorld;
import fr.campus.discoverySpring.campus.helloworld.service.BusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MainTests {

	@Test
	void contextLoads() {
	}

	@Test
	void messageAffiche(){
		BusinessService bs = new BusinessService();
		HelloWorld hw = bs.getHelloWorld();

		assertEquals(hw.toString(), "Hello World!");
	}

}
