package in.microsoft.model;

import java.util.List;
import java.util.Map;

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
	private String []arr;
	private List<Integer>list;
	private Map<String,Integer>map;

}
