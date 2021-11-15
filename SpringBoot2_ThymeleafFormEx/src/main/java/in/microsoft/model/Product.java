package in.microsoft.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	private Integer id;
	private String name;
	private String type;
	private String brand;
	private String note;

}
