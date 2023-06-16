package methods;

public class OverloadMethod {
	public static void m1() {
		System.out.println("Method 1 is Called");
	}

	public static void m1(String name) {
		System.out.println("Method 2 with actual/formal args of String type Called");
		System.out.println(name);
	}

	public static void m1(int rank) {
		System.out.println("Method 3 with actual/formal args of int type Called");
		System.out.println(rank);
	}

	public static void main(String[] args) {
		m1();
		m1("Goku");
		m1(7);

	}

}
