package in.microsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@ComponentScan({"",""}) for multiple base packages
@PropertySource({"classpath:AnotherProp.properties"})

public class SpringBoot2PropertiesFileApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBoot2PropertiesFileApplication.class, args);
		Object obj=context.getBean("jdbc");
		System.out.println(obj);
		
	}

}
