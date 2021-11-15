package in.microsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="studentTab")
public class Student {
	
	@Id
	@Column(name="sid")
    private Integer studentId;
	
	@Column(name="stdname",nullable=false,length=300)
	private String studentName;
	
	@Column(name="stdfee")
	private Double studentFee;

}
