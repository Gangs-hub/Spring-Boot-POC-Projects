package in.microsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name="projtab")
public class Projects {
	
	@Id
	@Column(name="pId")
	private Integer projId;
	@Column(name="pName")
	private String projName;
	@Column(name="pCost")
	private Double pojCost;
	
	

}
