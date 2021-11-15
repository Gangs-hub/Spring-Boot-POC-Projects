package in.microsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowController {
	
	@GetMapping("/show")
	public String showPage() {
		return "homepage";
	}
	
	//by default it is root only 
	@GetMapping()
	public String show() {
		return "homepage";
	}

}
