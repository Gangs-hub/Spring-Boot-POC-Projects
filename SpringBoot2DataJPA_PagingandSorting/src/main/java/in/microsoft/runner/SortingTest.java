package in.microsoft.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import in.microsoft.repo.PagingandSortingRepo;

@Component
public class SortingTest implements CommandLineRunner   {

	@Autowired
	private PagingandSortingRepo repo;
	
	public void run(String... args) throws Exception {
	
		//Case 1: Sort using single field
		
		//SQL:select * from new_book order by bcost asc;
		/*
		 * Sort s1=Sort.by("bookCost");
		 * 
		 * Sort s2=Sort.by(Direction.ASC,"bookName");
		 * 
		 * repo.findAll(s2).forEach(System.out::println);
		 */
		/*
		 * Case 2: Sort using muliple fields
		 * SQL: select * from new_book order by bcost asc,bname asc;
		 */
		
		/*
		 * Sort s3 = Sort.by(Direction.ASC,"bookName","bookCost");
		 * 
		 * repo.findAll(s3).forEach(System.out::println);
		 */
		
		// * SQL: select * from new_book order by bcost desc,bname desc;
		/*
		 * Sort s4= Sort.by(Direction.DESC,"bookCost","bookName");
		 * 
		 * repo.findAll(s4).forEach(System.out::println);
		 */
		
		/*Case 3: Sort with multiple field with Mix Sort
		 * SQL: select * from new_book order by bcost desc,bname asc;
		 * 
		 */
		Sort s5=Sort.by(Order.asc("bookName"),Order.desc("BookCost"));
		
		repo.findAll(s5).forEach(System.out::println);
		
		
		
	}

}
