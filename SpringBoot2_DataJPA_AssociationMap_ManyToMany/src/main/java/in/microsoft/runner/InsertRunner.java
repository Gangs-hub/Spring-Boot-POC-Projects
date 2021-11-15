package in.microsoft.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.microsoft.entity.Course;
import in.microsoft.entity.Student;
import in.microsoft.repo.CourseRepo;
import in.microsoft.repo.StudentRepo;
@Component
public class InsertRunner implements CommandLineRunner {
 
	@Autowired
    private StudentRepo srepo;
	@Autowired
    private CourseRepo crepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Course c1=new Course(1,"Java",10.23);
		Course c2=new Course(2,"AJava",100.23);
		
		crepo.save(c1);
		crepo.save(c2);
		
		Student std1=new Student(101,"Gangs","Pune",Arrays.asList(c1,c2));
		
		srepo.save(std1);
		
		

	}
	

}
