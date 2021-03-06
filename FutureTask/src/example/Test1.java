package example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test1 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService s = Executors.newCachedThreadPool();
		
		List<Callable<String>> tasks = new ArrayList<Callable<String>>();
		tasks.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				TimeUnit.SECONDS.sleep(5);
				System.out.println("over");
				return null;
			}
		});
		
		s.invokeAll(tasks,10,TimeUnit.DAYS);
		System.out.println("over 2");
		s.shutdown();
		
	}
}
