package in.microsoft.util;

import org.springframework.stereotype.Component;

import in.microsoft.model.Employee;

@Component
public class EmployeeUtil {
	
	public void employeesal(Employee e) {
	double sal=e.getEmpSal();
	e.setEmpHra(sal*12/100);
	e.setEmpTa(sal*3/100);
	}

}
