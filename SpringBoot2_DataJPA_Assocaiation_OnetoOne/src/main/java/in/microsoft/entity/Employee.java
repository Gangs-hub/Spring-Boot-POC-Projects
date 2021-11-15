package in.microsoft.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="emptab")
public class Employee {
	
	@Id
	private Integer empId;
	private String eName;
	private Double eSal;
	
	
	/*
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name="pidFk",unique = true)
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pidFk")
	private Profile prof;

}
