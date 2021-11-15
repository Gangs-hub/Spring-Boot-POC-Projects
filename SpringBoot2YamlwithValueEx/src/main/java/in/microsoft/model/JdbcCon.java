package in.microsoft.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component()
@ToString
public class JdbcCon {

	@Value("${my.app.driver}")
	private String driver;
	@Value("${my.app.url}")
	private String url;
	@Value("${my.app.userName}")
	private String userName;
	@Value("${my.app.password}")
	private String password;
	
	/*
	 * @Value("${my.app.list}") private List<Integer> list;
	 */
}
