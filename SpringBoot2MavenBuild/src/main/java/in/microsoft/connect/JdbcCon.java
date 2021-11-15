package in.microsoft.connect;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@Data
public class JdbcCon {
	
	@Value("${myKey}")
	private String myKey;

}
