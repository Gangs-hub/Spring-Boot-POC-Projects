package in.microsoft.entity;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="myStudent")
public class Student {
	
	@Id
	private Integer sId;
	private String sName;
	private String add;
	
	@ManyToMany  //for child 
	@JoinTable(name="stdCorsestab",
	joinColumns=@JoinColumn(name="sidFk"),
	inverseJoinColumns=@JoinColumn(name="cidFk")
	)
	private List<Course> cors;  //has-a collection variable
	
	
	

}
