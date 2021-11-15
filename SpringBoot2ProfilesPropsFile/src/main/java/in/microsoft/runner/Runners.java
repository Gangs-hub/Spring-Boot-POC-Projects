package in.microsoft.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.microsoft.connect.JdbcCon;

@Component
public class Runners implements CommandLineRunner{

	@Autowired
	private JdbcCon con;
	
	public void run(String... args) throws Exception {
		
		System.out.println(con);
		
		
	}

}
