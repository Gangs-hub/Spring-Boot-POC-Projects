package in.microsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.microsoft.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	//will create method in this interface and use it in impl class
	//query will give us result to the method 
	@Query("SELECT count(e.empMail) FROM Employee e WHERE e.empMail=:email")
	public Integer getEmployeeMailCount(String email);
			

}
