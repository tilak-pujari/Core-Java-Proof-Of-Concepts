package Polymorphism;

public class Program2 extends Program1 {

/// Variable Shadowing
	int a = 20;
	static int b = 200;

/// Method Overriding---->Run Time Polymorphism
	@Override
	public void m1() {
		System.out.println("Child Pro 2 NS Method");
	}

/// Method Shadowing
	public static void m2() {
		System.out.println("Child Pro 2 Static Method");
	}

	public static void main(String[] args) {
/// UpCasting
		Program1 p1 = new Program2();
		p1.m1();
		p1.m2();
		System.out.println(p1.a + "\t" + p1.b);
/// DownCasting
		Program2 p2 = (Program2) p1;
		p2.m1();
		p2.m2();
		System.out.println(p2.a + "\t" + p2.b);
	}

}
