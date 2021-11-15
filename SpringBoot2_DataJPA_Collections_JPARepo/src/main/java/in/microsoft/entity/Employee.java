package in.microsoft.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="empCollection") //automatically it will be emp_collection
public class Employee {
	@Id                        //mandatory or else gives error
	@Column(name="empId")
	private Integer eId;
	@Column(name="empName")
	private String eName;
	@Column(name="empSal")
	private Double eSal;
	
	//Set---Unordered collection of unique data
	@ElementCollection  //Mandatory
	@CollectionTable(name="emp_proj_tab", //child table name   //optional
	joinColumns=@JoinColumn(name="empId") //join column FK 
	)
	@Column(name="empProj") //Element column name
	private Set<String>empProj;
	
	//List
	@ElementCollection
	@CollectionTable(name="emp_modules_tab",  //child table name
	joinColumns=@JoinColumn(name="empId"))    //join column FK
	@Column(name="empModules")
	@OrderColumn(name="Position")
	private List<String>empModules;
	
	//Map
	@ElementCollection
	@CollectionTable(name="emp_clients_tab",
	joinColumns=@JoinColumn(name="empId")
	)
	@Column(name="empClients")
	@MapKeyColumn(name="Position")  //MapkeyColumn as OrderColumn >>optional
	private Map<String,String>empClients;
	
	

}
