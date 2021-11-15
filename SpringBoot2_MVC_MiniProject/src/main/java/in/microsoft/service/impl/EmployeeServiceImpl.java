package in.microsoft.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import in.microsoft.model.Employee;
import in.microsoft.repository.EmployeeRepository;
import in.microsoft.service.IEmployeeService;
import in.microsoft.util.EmployeeUtil;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired                       //get object from container
	private EmployeeRepository repo;
	@Autowired
	private EmployeeUtil empUtil;

	@Override
	public Integer saveEmployee(Employee e) {
		//calculations
		/*
		 * double sal=e.getEmpSal(); e.setEmpHra(sal*12/100); e.setEmpTa(sal*3/100);
		 */
		empUtil.employeesal(e);
		return repo.save(e).getEmpId();

	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();

	}

	@Override
	public Employee getSingleEmployee(Integer id) {
		Optional<Employee>opt=repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			return null;
		}

	}

	@Override
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public void updateEmployee(Employee e) {
		empUtil.employeesal(e);
		repo.save(e);

	}

	@Override
	public boolean isEmployeeMailExist(String email) {
		Integer count = repo.getEmployeeMailCount(email);
		boolean exist = count>0?true:false;
		return exist;
		//return repo.getEmployeeMailCount(email)>0;
	}

	@Override
	public Page<Employee> geAllEmployees(Pageable pageable) {
	
		return repo.findAll(pageable);
	}
	

}
