package methods;

public class ParaMethods {
	public static void area(double r) {
		System.out.println("Area of Circle for radius " + r + " is " + (3.142 * r * r));
	}

	public static void perimeter(double r) {
		System.out.println("Perimeter of Circle for radius " + r + " is " + (2 * 3.142 * r));
	}

	public static void greet(String name) {
		System.out.println("Hello " + name + " Good Morning");
		System.out.println(name + " are you Excited to learn Java");
	}

	public static void main(String[] args) {
		area(5);
		perimeter(5);
		greet("Conan");
	}

}
