package in.microsoft.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class Employee {
	
	@GetMapping("/find/{id}/{code}")
	public String showData(
			@PathVariable Integer id,
			@PathVariable String code
			) {
		//ResponseEntity("all",HttpStatus.BAD_GATEWAY);
				return "Hello "+id+" "+code;
		
	}
	
	

	@GetMapping("/find/{id}/{code}")
	public String showDataB(
			@PathVariable Integer id,
			@PathVariable String code
			) {
				return "Hello "+id+" "+code;
		
	}
	
	

}
