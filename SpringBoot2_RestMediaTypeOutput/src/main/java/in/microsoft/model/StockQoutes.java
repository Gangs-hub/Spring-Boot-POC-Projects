package in.microsoft.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockQoutes {
	
	private String code;
	private String vendor;
	
	private Product prod;

}
