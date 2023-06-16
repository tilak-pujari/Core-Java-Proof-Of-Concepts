package threads;


public class ThreadRunner {

	public static void main(String[] args) {

		// Task1
		System.out.println("Task1 Started");
		for (int i = 1; i <= 50; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 Ended");
		// Task2

		System.out.println("Task2 Started");
		for (int i = 51; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2 Ended");

		// Task3

		System.out.println("Task3 Started");
		for (int i = 101; i <= 150; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 Ended");
		System.out.println("Main Method Ended");

	}

}
