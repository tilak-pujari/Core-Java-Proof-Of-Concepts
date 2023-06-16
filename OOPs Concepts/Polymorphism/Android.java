package Polymorphism;

public class Android extends Phone {
	@Override
	public void pname() {
		System.out.println("Phone Brand is Realme");
	}

	@Override
	public void pcost() {
		System.out.println("Phone price is 13500 Rupees");
	}

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.pname();
		p1.pcost();
		Android a1 = new Android();
		a1.pname();
		a1.pcost();
		Phone p2 = new Android();
		p2.pname();
		p2.pcost();
		Android a2 = (Android) p2;
		a2.pname();
		a2.pcost();
	}
}