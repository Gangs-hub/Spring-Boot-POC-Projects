package in.microsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import in.microsoft.model.Product;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	public String showEditProd(Model model) {
		
		Product prd=new Product(101,"GauMax","New","NASA","Excl");
		model.addAttribute("product",prd);
		
		return "productEdit";
		
	}
}
