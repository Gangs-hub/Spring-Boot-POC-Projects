package in.microsoft.Json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONWrite {
	public static void main(String[] args) {
		
		Employee emp=new Employee(101,"Gangs");
		
		ObjectMapper om=new ObjectMapper();
		
		String json;
		try {
			json = om.writeValueAsString(emp);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//output: {"ename":"Gangs","eid":101}
		
	}

}
