package in.microsoft.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.microsoft.model.Address;
import in.microsoft.model.Student;

public class TestJson {
	
public static void main(String[] args) {
	
	Map<String,Integer>codes=new LinkedHashMap<>();
	
	codes.put("C1", 9145);
	codes.put("C2", 2566);
	codes.put("C3", 8956);
	
	
	// Student object to be created!
	Student s=new Student(101,"Gangs","confedencial",Arrays.asList("AB","BC","AC"),codes, new Address("H1532","Nanded"));
	
	ObjectMapper om=new ObjectMapper();
	
try {
	String json= om.writeValueAsString(s);
	System.out.println(json);
} catch (JsonProcessingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	
	
}
	
}