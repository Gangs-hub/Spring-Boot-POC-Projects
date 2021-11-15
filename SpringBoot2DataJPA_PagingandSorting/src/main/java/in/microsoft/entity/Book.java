package in.microsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="newBook")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	
	@Id
	@Column(name="bId")
	private Integer BookId;
	
	@Column(name="bname")
	private String bookName;
	@Column(name="bcost")
	private Double bookCost;
	
	

}
