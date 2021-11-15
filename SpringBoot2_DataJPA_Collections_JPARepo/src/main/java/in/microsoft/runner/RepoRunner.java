package in.microsoft.runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.microsoft.JPARepo.JPARepo;
import in.microsoft.entity.Employee;

@Component
public class RepoRunner implements CommandLineRunner {
	
	@Autowired
	private JPARepo jparepo;

	@Override
	public void run(String... args) throws Exception {
	
		Employee emp=new Employee();
		emp.setEId(1);
		emp.setEName("Gangs Kadam");
		emp.setESal(500000.00);
		
		//Set
		Set<String>empProj=new HashSet<>();
		empProj.add("P1");
		empProj.add("P2");
		empProj.add("P3");
		empProj.add("P4");
		
		//Set Added
		emp.setEmpProj(empProj);
		
		//List
		List<String>empModules=new ArrayList<>();
		empModules.add("Delta");
		empModules.add("Belta");
		empModules.add("Gelta");
		empModules.add("Alpha");
		
		//List added
		emp.setEmpModules(empModules);
		
		//Map
		Map<String,String>empClients=new HashMap<>();
		empClients.put("Mission1", "Delta");
		empClients.put("Mission2", "Alpha");
		empClients.put("Mission3", "Geta");
		empClients.put("Mission4", "Garner");
		
		// Map added
		emp.setEmpClients(empClients);
		
		
		//Save to add
		jparepo.save(emp);
	}

}
