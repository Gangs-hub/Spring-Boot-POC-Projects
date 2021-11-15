package in.microsoft.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private Integer sid;
	private String sname;
	
	@JsonIgnore
	private String password;
	
	//List/set/Array
	private List<String> course;
	//private Set<String> course1;
	//private String [] course2;
	
	
	//Map
	private Map<String,Integer>codes;
	
	//HAS-A relation
	
	private Address add;
	
	
	

}
