package in.microsoft.Json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONTest_Read {
	public static void main(String[] args) {
		
		//Read JSON object
		String json="{\"eid\":101, \"ename\":\"AA\"}";
		
		//before string start and at end must use \\
		
		ObjectMapper om= new ObjectMapper();
		try {
			Employee eob=om.readValue(json, Employee.class);
			System.out.println(eob);
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Output: Employee [eId=101, ename=AA]
		
		
		
		
	}

}
