package Inheritance;

public class Child extends Parent {
	int a = 22;
	static int b = 222;

	public void m3() {
		System.out.println("Child Class Non Static Method 3");
	}

	public void m4() {
		System.out.println("Child Class Non Static Method 4");
	}

	public static void main(String[] args) {
		Parent p = new Parent();// Parent Class Object Creation
		p.m1();
		p.m2();
		System.out.println(p.a + "\t" + p.b);
		Child c = new Child();// Child Class Object Creation
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		System.out.println(c.a + "\t" + c.b);
		Parent p1 = new Child();// Upcasting Child--->Parent
		p1.m1();
		p1.m2();
		System.out.println(p1.a + "\t" + p1.b);
		Child c1 = (Child) p1;// DownCasting Parent--->Child
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
		System.out.println(c1.a + "\t" + c1.b);
	}
}
