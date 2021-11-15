package in.microsoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.microsoft.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
