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
@NoArgsConstructor
@AllArgsConstructor
@Table(name="addtabb")
public class Address {
	
	@Id
	@Column(name="aid")
	private Integer addId;
	@Column(name="hno")
	private String hNo;
	@Column(name="loc")
	private String loc;
	@Column(name="pCode")
	private Long pinCode;

}
