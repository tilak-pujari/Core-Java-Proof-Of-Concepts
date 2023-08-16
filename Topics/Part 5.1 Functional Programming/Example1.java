package functionalProgramming;

public class Example1 {

	public static void main(String[] args) {
		//block of code without name --->also called a method without name--->anonymous class--->

		// Single abstract method-->only one abstract method in interface--->functional
		// interface
		StringExample result = (s1) -> {
			String c = "";
			for (int i = s1.length() - 1; i >= 0; i--) {
				c = c + s1.charAt(i);
			}
			return c;
		};

		System.out.println(result.reverse("Hello"));
	}

}
