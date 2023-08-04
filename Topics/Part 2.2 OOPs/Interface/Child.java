package Interface;

public class Child implements Parent2 {
	@Override
	public void m1() {
		System.out.println("Child Class Method 1");
	}

	@Override
	public void m2() {
		System.out.println("Child class Method 2");
	}
	public static void m3() {
		System.out.println("Child CLass Method 1");
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
	}
}