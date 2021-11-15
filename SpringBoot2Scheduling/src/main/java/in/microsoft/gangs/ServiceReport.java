package in.microsoft.gangs;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ServiceReport {

	//@Scheduled(fixedDelay=10000)
	@Scheduled(fixedRate=5000)
	public void reports() throws InterruptedException {
		
		Thread.sleep(5000);
		System.out.println("Hello everyone!!"+ new Date());
		
	}
}
