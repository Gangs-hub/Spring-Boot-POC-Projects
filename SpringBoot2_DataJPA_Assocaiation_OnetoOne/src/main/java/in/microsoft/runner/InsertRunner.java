package in.microsoft.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.microsoft.entity.Employee;
import in.microsoft.entity.Profile;
import in.microsoft.repo.EmployeeRepo;

@Component
public class InsertRunner implements CommandLineRunner {
	
     @Autowired
	private EmployeeRepo repo;
     
	public void run(String... args) throws Exception {
		
		Employee emp1=new Employee(101,"Gangs kadam",2223.00,new Profile(11,"Dev",2.7));
		Employee emp2=new Employee(102,"Gaurav kadam",2223.00,new Profile(12,"Tester",2.7));
		Employee emp3=new Employee(103,"Nagesh suth",2223.00,new Profile(13,"BA",2.7));
		Employee emp4=new Employee(104,"Pranav penthe",2223.00,new Profile(14,"FullStack",2.7));
		
		repo.save(emp1);
		repo.save(emp2);
		repo.save(emp3);
		repo.save(emp4);
		
	}

}
