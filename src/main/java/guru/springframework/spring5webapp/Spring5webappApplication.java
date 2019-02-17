package guru.springframework.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Spring5webappApplication.class, args);
		System.out.println("Contains Author " + context.
                containsBeanDefinition("author"));
        System.out.println("Contains Book  " + context.
                containsBeanDefinition("book"));
	}

}

