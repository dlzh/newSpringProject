package com.dz.NewSpringPrj;

import com.dz.NewSpringPrj.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NewSpringPrjApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(NewSpringPrjApplication.class, args);
		MyController controller = context.getBean(MyController.class);
		System.out.println(controller.sayHello());
	}
}
