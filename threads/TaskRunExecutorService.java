package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskRunExecutorService {

	public static void main(String[] args) {

		ExecutorService executerServices = Executors.newSingleThreadExecutor();
		executerServices.execute(new Task1());
		executerServices.execute(new Thread(new Task2()));

		System.out.println("Task3 Started");
		for (int i = 101; i <= 150; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 Ended");
		System.out.println("Main Method Ended");
		executerServices.shutdown();
	}

}
