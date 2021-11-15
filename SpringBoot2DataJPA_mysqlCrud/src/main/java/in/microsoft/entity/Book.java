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
@Table(name="booktab")
public class Book {
	

	@Id
	@Column(name="bid")
	private Integer bookId;
	@Column(name="bname")
	private String bookName;
	@Column(name="bcost")
	private Double bookCost;

}
