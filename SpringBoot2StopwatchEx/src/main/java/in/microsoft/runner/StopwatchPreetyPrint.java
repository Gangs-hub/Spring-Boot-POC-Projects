package in.microsoft.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
public class StopwatchPreetyPrint implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		StopWatch watch=new StopWatch("New Tasks");

		int length=30;
        watch.start("#BLOCK1");
		System.out.println("Loop started!");
		for (int i = 0; i < length; i++) {
			int x=i*i;

		}
		Thread.sleep(5000);
		watch.stop();
		
		
        watch.start("#BLOCK2");
		System.out.println("Loop started!");
		for (int i = 0; i < length; i++) {
			int x=i*i;

		}
		Thread.sleep(7000);
		watch.stop();
		
		watch.start("#BLOCK3");
		System.out.println("Loop started!");
		for (int i = 0; i < length; i++) {
			int x=i*i;

		}
		Thread.sleep(10000);
		watch.stop();
		
		
		System.out.println(watch.getLastTaskName());
		
        System.out.println(watch.getTotalTimeSeconds());
        System.out.println(watch.getTotalTimeMillis());
        System.out.println(watch.getTotalTimeNanos());
        
        
        System.out.println(watch.prettyPrint());
        
        
        
        
        
        
        
        

	}

}
