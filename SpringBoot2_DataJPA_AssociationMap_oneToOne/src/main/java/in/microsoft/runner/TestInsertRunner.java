package in.microsoft.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.microsoft.entity.Employee;
import in.microsoft.entity.Project;
import in.microsoft.repo.EmployeeRepo;
import in.microsoft.repo.ProjectRepo;
@Component
public class TestInsertRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepo emprepo;
	@Autowired
	private ProjectRepo projrepo;

	@Override
	public void run(String... args) throws Exception {
		
		//Many rows in Employee table are connected in one row of Proj table
		
		Project p1 =new Project(1,"Delta","TCS",1.1);
		Project p2 =new Project(2,"Belta","TCL",1.2);
		
		projrepo.save(p1);
		projrepo.save(p2);
		
		Employee emp1=new Employee(101,"Gangs","Aerospace",p1);
		Employee emp2=new Employee(102,"Pranay","AeroSoil",p2);
		Employee emp3=new Employee(103,"Madhav","Military",p1);
		Employee emp4=new Employee(104,"Shivam","Defence",p2);
		
		emprepo.save(emp1);
		emprepo.save(emp2);
		emprepo.save(emp3);
		emprepo.save(emp4);
	}

}
