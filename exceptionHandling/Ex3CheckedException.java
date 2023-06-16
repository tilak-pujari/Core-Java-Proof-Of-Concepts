package exceptionHandling;

public class Ex3CheckedException {

	public static void main(String[] args) throws InterruptedException {
		method1();
		System.out.println("Main Method is done");

	}

	private static void method1() throws InterruptedException {
		Thread.sleep(2000);

	}

}
