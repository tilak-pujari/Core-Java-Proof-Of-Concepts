package Polymorphism;

public class Child extends Parent {
	int a = 22;
	static int b = 222;

	@Override
	public void m1() {
		System.out.println("Child Class Non Static Method");
	}

	public static void m2() {
		System.out.println("Child Class Static Method");
	}

	public static void main(String[] args) {
		Parent p = new Parent();// Parent Class Object Creation
		p.m1();
		p.m2();
		System.out.println(p.a + "\t" + p.b);
		Child c = new Child();// Child Class Object Creation
		c.m1();
		c.m2();
		System.out.println(c.a + "\t" + c.b);
		Parent p1 = new Child();// Upcasting Child--->Parent
		p1.m1();
		p1.m2();
		System.out.println(p1.a + "\t" + p1.b);
		Child c1 = (Child) p1;// DownCasting Parent--->Child
		c1.m1();
		c1.m2();
		System.out.println(c1.a + "\t" + c1.b);
	}

}
