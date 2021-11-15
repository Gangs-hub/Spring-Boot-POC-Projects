package in.FBANG.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DriverClass {

	@Value("Driver")
	private String name;
	@Value("URL")
	private String URL;
	
	
	public String toString() {
		return "DriverClass [name=" + name + ", URL=" + URL + "]";
	}
	
	
	
	
	
	
}
