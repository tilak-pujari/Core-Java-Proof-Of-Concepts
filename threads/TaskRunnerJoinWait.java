package threads;

public class TaskRunnerJoinWait {

	public static void main(String[] args) throws InterruptedException {

		Task1 task1 = new Task1();
		task1.start();

		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();

		task1.join();
		task2Thread.join();

		System.out.println("Task3 Started");
		for (int i = 101; i <= 150; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 Ended");
		System.out.println("Main Method Ended");

	}

}
