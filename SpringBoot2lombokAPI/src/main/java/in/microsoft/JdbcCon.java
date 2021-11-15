package in.microsoft;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@Data

//@RequiredArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
@EqualsAndHashCode
public class JdbcCon {

	private String name;
	//@NonNull
	private String add;
	//@NonNull
	private int age;
	
	
	
}
