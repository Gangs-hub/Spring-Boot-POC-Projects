package in.microsoft.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.microsoft.entity.Address;
import in.microsoft.entity.Student;
import in.microsoft.repo.AddressRepo;
import in.microsoft.repo.StudentRepo;

@Component
public class DataInsertRunner implements CommandLineRunner {

	@Autowired
	private AddressRepo addrepo;
	@Autowired
	private StudentRepo stdrepo;


	public void run(String... args) throws Exception {

		Address add1=new Address(1,"Surya Niwas","Nanded",1234567l);
		Address add2=new Address(2,"Andrew Niwas","New York",1234555l);
		Address add3=new Address(3,"Anand Niwas","UK",123465665l);


		
		//address has been saved to db for student 
		Student std1 = new Student(101,"Gangadhar Kadam","DSA",Arrays.asList(add1,add2,add3));
		
		addrepo.save(add1);
		addrepo.save(add2);
		addrepo.save(add3);
		stdrepo.save(std1);

		Address add4=new Address(4,"Anvi Niwas","Nanded",1234567l);
		Address add5=new Address(5,"Penvi Niwas","New jersy",1234555l);
		
		Student std2 = new Student(102,"Akash Kadam","Spring boot",Arrays.asList(add4,add5));

		
		addrepo.save(add4);
		addrepo.save(add5);
		stdrepo.save(std2);
	}

}
