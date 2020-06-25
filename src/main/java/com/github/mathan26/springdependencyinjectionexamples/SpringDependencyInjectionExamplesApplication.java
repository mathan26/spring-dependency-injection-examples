package com.github.mathan26.springdependencyinjectionexamples;

import com.github.mathan26.springdependencyinjectionexamples.controllers.ConstructorInjectedController;
import com.github.mathan26.springdependencyinjectionexamples.controllers.MyController;
import com.github.mathan26.springdependencyinjectionexamples.controllers.PropertyInjectedController;
import com.github.mathan26.springdependencyinjectionexamples.controllers.SetterInjectedController;
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

		System.out.println("------ Property Injection");

		PropertyInjectedController propertyInjectedController=(PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor" );
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
