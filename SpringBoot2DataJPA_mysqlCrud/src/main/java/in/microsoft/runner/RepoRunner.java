package in.microsoft.runner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.microsoft.entity.Book;
import in.microsoft.repo.CrudRepositoryInterface;

@Component
 class RepoRunner implements CommandLineRunner {

	@Autowired
	private CrudRepositoryInterface repo;
	
	public void run(String... args) throws Exception {
		
		System.out.println("Shivam Avchar");
		/*
		 * 1.save()  //Single record to be saved. 
		 * Book book= new Book(101,"Shivan Avchar",200.23);
		  repo.save(book);
		 * 
		 */
		
		/* 2 SaveAll()   //multiple records to be saved
		repo.saveAll(Arrays.asList(new Book(101,"Shivam Avchar",300.00),
				new Book(102,"Madhav Kadam",300.00),
				new Book(103,"Gangadhar Kadam",4000.0)
				));
		
		*/
		
		/* 3. findAll()  select * from tableName;
		Iterable<Book>itr= repo.findAll();
		
		Iterator<Book>it=itr.iterator(); 
		
		while(it.hasNext()) {
			Book book=it.next();
			System.out.println(book);
		}
		*/
		/*4. existById >true/ false
		 * 
		 */
		//System.out.println(repo.existsById(102));
		
		/*5. FindAllbyIds
		 * 
		 * 
		 */
		//System.out.println());
	//	repo.findAllById(Arrays.asList(102,103,104)).forEach(System.out::Println<Book>);
	
		/*
	Iterable<Book>itr=	repo.findAllById(Arrays.asList(102,103,104));
	
	Iterator itror=itr.iterator();
	
	while(itror.hasNext()) {
		Book book =(Book) itror.next();
		System.out.println(book);
	}
		*/
		
		/* 6. Findby ID gives actual data
		 * Optional<String> to avoid 
		 *   
		 */
		
		Optional<Book> opt=repo.findById(103);
		if(opt.isPresent()) {
			Book book=opt.get();
			System.out.println("Data is "+book);
		}else {
			System.out.println("No data found!");
		}
		
		/* deleteById(id)
		 * deleteAllById(List)
		 * deleteAll()
		 * 
		 * 
		 * 
		 */
		

	}

}
