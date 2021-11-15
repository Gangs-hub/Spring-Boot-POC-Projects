package in.microsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.microsoft.model.Employee;

@Controller
public class EmployeeController {
	
	//Show register page
      @GetMapping("/register")
	public String showReg() {
		return "empRegister";
	}
      //Read form Data
      @PostMapping("/save")
      public String saveEmp(@ModelAttribute Employee emp,
    		Model model  ) {
    	  System.out.println(emp);
    	  model.addAttribute("employee", emp);
    	  return "empData";
    	  
      }

}
