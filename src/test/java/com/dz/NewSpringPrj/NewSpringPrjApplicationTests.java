package com.dz.NewSpringPrj;

import com.dz.NewSpringPrj.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class NewSpringPrjApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;
	@Test
	void testAutoWiredController(){
		assert(myController.sayHello()).equals("Hello Everyone");
	}
	@Test
	void testGetControllerFromContext()
	{
		MyController controller = applicationContext.getBean(MyController.class);
		System.out.println(controller.sayHello());
		assert(controller.sayHello()).equals("Hello Everyone");
	}

	@Test
	void contextLoads() {
	}

}
