package Inheritance;

public class Son extends Father {
	String vehicle = "Scooty";
	double money = 99.56;

	public void m3() {
		System.out.println("Son Class");
	}

	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s.balance);
		System.out.println(s.car);
		s.m1();
		System.out.println(s.bike);
		System.out.println(s.property);
		s.m2();
		System.out.println(s.money);
		System.out.println(s.vehicle);
		s.m3();

	}

}
