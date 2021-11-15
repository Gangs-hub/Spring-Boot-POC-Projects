package in.microsoft.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.microsoft.entity.Projects;
import in.microsoft.repo.PageRepo;

//@Component
public class InsertRunner implements CommandLineRunner {

	@Autowired
	private PageRepo repo;
	
	public void run(String... args) throws Exception {
		
		repo.saveAll(Arrays.asList(new Projects(1,"Delta",11.12),
				                   new Projects(2,"Hashed",101.12),
				                   new Projects(3,"Golf",111.2),
				                   new Projects(4,"John",100.12),
				                   new Projects(5,"Dear",755.12)
				));
		
		
		

	}

}
