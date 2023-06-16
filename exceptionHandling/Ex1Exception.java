package exceptionHandling;

public class Ex1Exception {

	public static void main(String[] args) {

		method1();
		System.out.println("main method is done");

	}

	private static void method1() {
		method2();
		System.out.println("Method 1 is done");

	}

	private static void method2() {
		int[] i = { 10, 9, 85, 54 };
		int a = i[5];
		System.out.println("Method 2 is done");
	}

}
