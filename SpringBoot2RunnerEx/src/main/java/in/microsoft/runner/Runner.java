package in.microsoft.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Runner implements CommandLineRunner {

	
	public void run(String... args) throws Exception {
		
		System.out.println("Runner Running perfectly! R");

	}

}
