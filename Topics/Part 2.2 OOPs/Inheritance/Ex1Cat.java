package Inheritance;

public class Ex1Cat extends Ex1Animal {

	Ex1Cat(String name, String breed) {
		super(name, breed);
	}

	public static void main(String[] args) {
		Ex1Cat cat = new Ex1Cat("Tom", "Pluto");
		cat.sound("Meow Meow");
		System.out.println(cat);

	}

}
