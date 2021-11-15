package in.microsoft;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("jdbc")
public class JdbcConnect {
	
	@Value("${app.driver}")
	private String driver;
	
	@Value("${app.url}")
	private String url;
	
	@Value("${app.username}")
	private String userName;
	
	@Value("${app.password}")
	private String password;
	
	@Value("${app.fine}")
	private String fine;

	@Override
	public String toString() {
		return "JdbcConnect [driver=" + driver + ", url=" + url + ", userName=" + userName + ", password=" + password
				+ ", fine=" + fine + "]";
	}

	
	

}
