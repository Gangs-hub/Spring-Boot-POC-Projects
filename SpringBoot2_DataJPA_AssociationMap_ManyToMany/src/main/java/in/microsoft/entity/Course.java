package in.microsoft.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="courseTab")
public class Course {
	@Id
	private Integer cId;
	private String cName;
	private Double cFee;
	
	
	
	

}
