package threads;

public class Task1 extends Thread {

	@Override
	public void run() {
		System.out.println("Task1 Started");
		for (int i = 1; i <= 50; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 Ended");
	}

}
