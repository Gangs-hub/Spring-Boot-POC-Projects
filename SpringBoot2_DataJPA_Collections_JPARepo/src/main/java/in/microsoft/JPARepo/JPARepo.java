package in.microsoft.JPARepo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.microsoft.entity.Employee;

public interface JPARepo extends JpaRepository<Employee, Integer> {

}
