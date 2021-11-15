package in.microsoft.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	TestController(){
		System.out.println("OBject Created!");
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showPage() {
		System.out.println("GET is called!");
		return "page";
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String  showDiffPage() {
		System.out.println("Post is called!");
		return "page2";
	}
	@RequestMapping(value= {"/logout","/use","/unuse"})
	public String diffMethod() {
		return "page";
	}
	

}
