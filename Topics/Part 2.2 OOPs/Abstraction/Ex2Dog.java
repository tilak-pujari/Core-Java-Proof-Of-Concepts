package Abstraction;

public class Ex2Dog extends Ex2Animal {
	@Override
	public void sound() {
		System.out.println("Dog Barks: Bow Bow");
	}

	@Override
	public void breed() {
		System.out.println("Dog Breed: Shiba Inu");

	}

	public static void name() {
		System.out.println("Dog Name: Scooby");
	}

	public static void main(String[] args) {
		Ex2Dog d = new Ex2Dog();
		d.name();
		d.breed();
		d.sound();
	}

}
