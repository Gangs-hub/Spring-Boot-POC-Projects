package in.microsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2StopwatchExApplication {

	public static void main(String[] args) {
		ApplicationContext context=    SpringApplication.run(SpringBoot2StopwatchExApplication.class, args);
	}

}
