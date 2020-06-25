package com.github.mathan26.springdependencyinjectionexamples;

import com.github.mathan26.springdependencyinjectionexamples.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionExamplesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringDependencyInjectionExamplesApplication.class, args);
		MyController myController=(MyController)ctx.getBean("myController");
		String greetings = myController.sayHello();
		System.out.println(greetings);

	}

}
