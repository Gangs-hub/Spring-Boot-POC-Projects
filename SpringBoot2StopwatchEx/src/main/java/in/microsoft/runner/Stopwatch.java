package in.microsoft.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

//@Component
public class Stopwatch implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		
		//for single process/loop to check time
		StopWatch watch =new StopWatch();
		
		int length=30;
		
		watch.start();
		System.out.println("Loop started!");
		for (int i = 0; i < length; i++) {
			int x=i*i;
			
		}
		Thread.sleep(5000);
		
	
		System.out.println("Loop Ended!");
		watch.stop();
		System.out.println(watch.getTotalTimeSeconds());
		System.out.println(watch.getTotalTimeMillis());
		System.out.println(watch.getTotalTimeNanos());
	}

}
