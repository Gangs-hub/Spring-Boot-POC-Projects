package in.microsoft.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
@ConfigurationProperties(prefix="my.app")
public class Model {
	
	private Integer pId;
	private String pCode;
	private String pVersion;
	
	//object type dependency
	//here HAS-A relationship(reverse not required!)
	CompanyGroup group;

}
