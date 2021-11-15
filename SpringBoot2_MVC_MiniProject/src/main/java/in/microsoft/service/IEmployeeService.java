package in.microsoft.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import in.microsoft.model.Employee;

public interface IEmployeeService {

	Integer saveEmployee(Employee e); //passing full employee object to save!
	List<Employee>getAllEmployees();
	Employee getSingleEmployee(Integer id);
	void deleteEmployee(Integer id);
	void updateEmployee(Employee e);
	boolean isEmployeeMailExist(String email);
	Page<Employee> geAllEmployees(Pageable pageable); //return page with employee
	
	
	
	
}
