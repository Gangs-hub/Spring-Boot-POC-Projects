package in.microsoft.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.microsoft.model.Student;


@Controller
//@RequestMapping("/data") // class level URL path
public class ModelUi {

	//Primitive data over UI
	@GetMapping("/show")
	public String showData(Model model) {
		model.addAttribute("snmae", "Anand Kumar");
		model.addAttribute("age", 25);

		return "Uipage";
	}
	
	//Object data over UI
	@GetMapping("/objShow")
	public String showObjData(Model model) {
		
		Student std=new Student(11,"Gangs Kadam",1122.00);
		model.addAttribute("student", std);

		return "Objpage";
	}
	
	//collection data
	
	@GetMapping("/listshow")
	public String listData(Model model) {
		
		List<String>list=new ArrayList<>();
		list.add("Hydrabad");
		list.add("Banglore");
		list.add("Pune");
		list.add("Mumbai");
		model.addAttribute("anyName", list);
		
		List<Student>stdlist=Arrays.asList(new Student(1,"Ajay Kadam",55.33),
				                           new Student(2,"Mayank Agrawal",55.66),
				                           new Student(3,"Shashank Agrawal",585.66) {
		});
		
		model.addAttribute("stdlist", stdlist);
		
		
		return "CollectionPage";
	}
	
	

	@GetMapping()
	public String showData() {
	return "welcome";
	}
	

}
