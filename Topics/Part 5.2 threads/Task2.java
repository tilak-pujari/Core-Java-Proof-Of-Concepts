package threads;

public class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Task2 Started");
		for (int i = 51; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2 Ended");

	}

}
