package in.microsoft.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import in.microsoft.entity.Projects;
import in.microsoft.repo.PageRepo;

@Component
public class PageRunner implements CommandLineRunner {

	@Autowired
	private PageRepo repo;
	
	public void run(String... args) throws Exception {
		
		//Pagination Input (Page number(starts with 0),size(starts with 1))
		//should not be zero 
		//Interface
		Pageable pageable=PageRequest.of(0, 2); //slice DB table data
		
		//Execute
		//class
		Page<Projects>page=repo.findAll(pageable);
		
		//Print data
		
		if(page.hasContent()) {
			List<Projects>list=page.getContent();
			
			list.forEach(System.out::println);
		}else {
			System.out.println("Given Page not exists!");
			
		}
		
	//------------Meta Data-----------------------------------
		
		System.out.println("Page available or not "+page.hasContent());
		System.out.println("Total Pages "+page.getTotalPages());
		System.out.println("Has Next Pages "+page.hasNext());
		System.out.println("Has Previous Pages "+page.hasPrevious());
		System.out.println("Is first "+page.isFirst());
		System.out.println("Is Last "+page.isLast());
		System.out.println("Is empty "+page.isEmpty());

	}

}
