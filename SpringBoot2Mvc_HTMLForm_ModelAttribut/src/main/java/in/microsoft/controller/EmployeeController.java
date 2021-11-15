package in.microsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.microsoft.model.Employee;

@Controller
public class EmployeeController {
	
	@GetMapping("/show")
	public String empRegister() {
		
		return "employeeReg";
	}
	
	@PostMapping("/create")
	public String readData(
			@ModelAttribute Employee employee,
			Model model) {
		
		model.addAttribute("eob", employee);
		return "employeeData";
		
	}

}
