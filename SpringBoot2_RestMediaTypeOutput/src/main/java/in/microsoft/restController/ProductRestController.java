package in.microsoft.restController;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.microsoft.model.Product;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	
	
	//Plain containt type-pain text 
	@GetMapping("/msg")
	public String showMsg() {
		return "Hello plain data!";
		
	}
	
	//single object as JSON
	@GetMapping("/one")
	public Product findOne() {
		return new Product(101,"DELTA",102.12);
	}
	
	//List of object i.e collection
	@GetMapping("/all")
	public List<Product>findAll(){
		return Arrays.asList(new Product(101,"OV",1222.1),
				new Product(102,"JJ",552.1),
				new Product(103,"OKK",1522.1),
				new Product(104,"OVL",5252.1));
		
	}
	

}
