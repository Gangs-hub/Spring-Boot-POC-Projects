package in.microsoft.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="stuTab")
@Entity
public class Student {
	
	@Id
	@Column(name="stdid")
	private Integer studentId;
	@Column(name="stdname")
	private String studentName;
	@Column(name="course")
	private String course;
	
	@OneToMany(cascade = CascadeType.ALL) //for Non select operations ,save ,update,delete
	@JoinColumn(name="stdidFk")
	private List<Address> add;   //collection type dependency

}
