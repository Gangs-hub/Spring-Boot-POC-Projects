package in.microsoft.jdbc;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="my.app")
public class JdbcCon {
	
	private String driver;
	private String url;
	private String userName;
	private String password;
	
	
	
}
