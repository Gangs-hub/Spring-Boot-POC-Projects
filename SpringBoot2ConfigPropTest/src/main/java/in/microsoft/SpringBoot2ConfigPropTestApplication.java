package in.microsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2ConfigPropTestApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringBoot2ConfigPropTestApplication.class, args);
	Object obj=context.getBean("model");
	System.out.println(obj);
	}

}
