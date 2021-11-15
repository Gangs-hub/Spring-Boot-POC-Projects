package in.microsoft.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.microsoft.entity.Book;
import in.microsoft.repo.PagingandSortingRepo;

//@Component
public class InsertTest implements CommandLineRunner {

	@Autowired
	private PagingandSortingRepo repo;
	
	public void run(String... args) throws Exception {
		
		repo.save(new Book(10, "Core Java", 200.0));
		repo.save(new Book(11, "Adv Java", 500.0));
		repo.save(new Book(12, "Boot", 500.0));
		repo.save(new Book(13, "Microservices", 500.0));
		repo.save(new Book(14, "Angular", 500.0));
		repo.save(new Book(15, "ReactJS", 150.0));
		repo.save(new Book(16, "HTML/CSS", 50.0));
		
		
	}

}
