package in.microsoft.restcontroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.microsoft.model.Employee;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@PostMapping("/save")
	public String createEmp(
			@RequestBody Employee employee
			) {
		return " created! "+employee;
		//To take things as input
	}

}
