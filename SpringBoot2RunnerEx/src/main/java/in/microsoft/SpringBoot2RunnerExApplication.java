package in.microsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2RunnerExApplication {

	public static void main(String[] args) {
		ApplicationContext context=  SpringApplication.run(SpringBoot2RunnerExApplication.class, args);
		/*
		 * Object obj=context.getBean("runner"); System.out.println(obj);
		 */
	}

}
