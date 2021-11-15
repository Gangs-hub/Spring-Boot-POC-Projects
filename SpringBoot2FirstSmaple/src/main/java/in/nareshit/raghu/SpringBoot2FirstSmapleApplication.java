package in.nareshit.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan({        //used to define multiple base packages
	"in.microsoft.com",
	"in.FBANG.com"
	})
public class SpringBoot2FirstSmapleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBoot2FirstSmapleApplication.class, args);
		Object object= context.getBean("driverClass");
		System.out.println(object);
		
		 
		
		
	}

}
