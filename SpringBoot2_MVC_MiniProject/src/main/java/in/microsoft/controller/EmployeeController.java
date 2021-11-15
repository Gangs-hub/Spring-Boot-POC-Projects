package in.microsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import in.microsoft.model.Employee;
import in.microsoft.service.impl.EmployeeServiceImpl;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl empservice;

	//1.show register page
	@GetMapping("/register")
	public String showReg() {
		return "EmployeeRegisterNew";
	}

	//2. save operation for registerd page

	@PostMapping("/save")
	public String saveData(
			@ModelAttribute Employee emp,  //reading form data
			Model model                    //to give data to form
			) {
		Integer id=empservice.saveEmployee(emp); //store in DB
		String msg= "Employee has been created!"+id;
		model.addAttribute("message", msg);  //send message to UI

		return "EmployeeRegisterNew";

	}

	//3. Display data on UI
	/*
	 * @GetMapping("/all") public String showAll( Model model,
	 * 
	 * @RequestParam(required=false) String message
	 * 
	 * ) {
	 * 
	 * List<Employee>empList=empservice.getAllEmployees();
	 * model.addAttribute("employeeList", empList); //
	 * model.addAttribute("message",message); return "EmployeeData2"; }
	 */
	
	
	//Pageable
		@GetMapping("/all")
		public String getPageEmployees(
				@PageableDefault(page=0,size=5) Pageable pageable,
				@RequestParam(required=false) String message ,//to take request from other method via redirect or from form
				Model model

				) {
			Page<Employee> page=empservice.geAllEmployees(pageable);
			model.addAttribute("message", message);
			model.addAttribute("page", page);  
			model.addAttribute("list", page.getContent());  //list

			return"EmployeeData2";
		}
	
	
	

	//4.Remove Operation
	@GetMapping("/delete")
	public String removeEmployee(
			@RequestParam Integer id,  //to take id from Form
			RedirectAttributes redirect  //to take key-val from here to other
			) {
		empservice.deleteEmployee(id);
		redirect.addAttribute("message", "employee id '"+id+"' deleted");

		return "redirect:all";   //Redirect to All method here
	}



	//5.Show edit
	@GetMapping("/edit")
	public String showEdit(
			@RequestParam(required=false) Integer id,
			Model model

			) {
		Employee e=	empservice.getSingleEmployee(id);
		model.addAttribute("employee",e);

		return "EmployeeEdit2";
	}
	//6.do update
	@PostMapping("/update")
	public String updateEmp(
			RedirectAttributes redirect,
			@ModelAttribute Employee emp

			) {
		empservice.updateEmployee(emp);
		redirect.addAttribute("message", "Employee '"+emp.getEmpName()+"' updated!");

		return "redirect:all";
	}
	//Ajax validation
	@GetMapping("/validate")
	@ResponseBody
	public String validateEmail(
			@RequestParam String email
			) {
		String message="";
		if(empservice.isEmployeeMailExist(email)) {
			message =email +", Already exist!";
		}
		return message;
	}

	

}


