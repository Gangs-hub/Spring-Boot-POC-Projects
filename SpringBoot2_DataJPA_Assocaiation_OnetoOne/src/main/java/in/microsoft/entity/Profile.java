package in.microsoft.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="proftab")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
	
	@Id
	private Integer pid;
	private String role;
	private Double exp;
	
	

}
