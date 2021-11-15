package in.microsoft.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.microsoft.connect.JdbcCon;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private JdbcCon con;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(con);

	}

}
