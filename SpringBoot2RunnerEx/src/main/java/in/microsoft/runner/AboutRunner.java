package in.microsoft.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AboutRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("About Runner is running A");

	}

}
