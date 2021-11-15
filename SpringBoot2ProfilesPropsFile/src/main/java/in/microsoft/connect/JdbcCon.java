package in.microsoft.connect;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class JdbcCon {
	
	@Value("${app.driver}")
	private String driver;
	@Value("${app.url}")
	private String url;

}
