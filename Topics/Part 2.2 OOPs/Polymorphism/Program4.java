package Polymorphism;

public class Program4 extends Program3 {
	int a = 66;
	static int b = 666;

	@Override
	public void m1() {
		System.out.println("Program 2 Method-1");
	}

	public static void m2() {
		System.out.println("Program 2 Method-2");
	}

	public static void main(String[] args) {
		Program1 p1 = new Program1();// Parent class Object Creation
		System.out.println(p1.a + "\t" + p1.b);
		p1.m1();
		p1.m2();
		Program2 p2 = new Program2();// Child class Object Creation
		System.out.println(p2.a + "\t" + p2.b);
		p2.m1();
		p2.m2();
		Program1 p3 = new Program2();// Upcasting child ref ---> parent ref
		System.out.println(p3.a + "\t" + p3.b);
		p3.m1();
		p3.m2();
		Program2 p4 = (Program2) p3;// Downcasting parent ref ---> child ref
		System.out.println(p4.a + "\t" + p4.b);
		p4.m1();
		p4.m2();
	}

}
