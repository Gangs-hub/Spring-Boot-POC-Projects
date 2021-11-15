package in.microsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2YamlwithConfigurationPropExApplication {

	public static void main(String[] args) {
 ApplicationContext context=SpringApplication.run(SpringBoot2YamlwithConfigurationPropExApplication.class, args);
 Object obj= context.getBean("jdbcCon");
 System.out.println(obj);
	}

}
