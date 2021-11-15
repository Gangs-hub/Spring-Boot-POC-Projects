package in.microsoft.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile({"!qa","!prod"}) //we can use here not operator as well
//@Profile({"qa","prod"})
public class RunnerProfiles implements CommandLineRunner {
	
	@Value("${my.title}")
	private String title;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Title is "+title);
		
		

	}

}
