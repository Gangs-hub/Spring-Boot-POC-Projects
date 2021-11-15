package in.microsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringBoot2SchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2SchedulingApplication.class, args);
	}

}
