package in.microsoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//Model>>Class mapped with Form/ Entity class mapped with DB

@Data
@Entity
@Table(name="emptab")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	@Column(name="esal")
	private Double empSal;
	@Column(name="edept")
	private String empDept;
	@Column(name="ehra")
	private Double empHra;
	@Column(name="eta")
	private Double empTa;
	@Column(name="email")
	private String empMail;
	@Column(name="egen")
	private String empGen;
	
	
	

}
