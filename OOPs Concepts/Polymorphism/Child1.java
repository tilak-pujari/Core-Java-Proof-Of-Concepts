package Polymorphism;

public class Child1 extends Parent1 {

	@Override
	public void m1() {
		System.out.println("This is from Child Class");
	}

	@Override
	public void m2() {
		System.out.println("Child Class Method-2");

	}

	public static void main(String[] args) {
		Parent1 p = new Parent1();// Super Class Object creation
		p.m1();
		p.m2();
		Child1 c1 = new Child1();// Child Class Object creation
		c1.m1();
		c1.m2();
		Parent1 p2 = new Child1();// Upcasting
		p2.m1();
		p2.m2();
		Child1 c2 = (Child1) p2;// Downcasting
		c2.m1();
		c2.m2();

	}

}
