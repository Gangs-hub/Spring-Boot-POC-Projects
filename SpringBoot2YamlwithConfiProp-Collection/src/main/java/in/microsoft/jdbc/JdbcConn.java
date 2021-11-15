package in.microsoft.jdbc;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="my.app")
public class JdbcConn {
	
	private String driver;
	private String url;
	private String userName;
	private String password;
	
	//List Set Array 
	private List<String> list;
	private Set<String> allSet;
	private Integer[]array;
	
	//Map and properties
	
	private Map<Integer,String>map;
	private Properties props; 
	
	//Object HAS-Realation 
	
	private ExtraDriver drive;
	
	
	
	

}
