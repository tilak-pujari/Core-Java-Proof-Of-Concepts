package methods;

public class NoArgMethod {
	public static void m1() {
		System.out.println("Hello!");
		System.out.println("Good Morning!");
	}

	public static void main(String[] args) {
		m1();// Directly use Method Name
		NoArgMethod.m1();// Class Name.MethodName

	}

}
