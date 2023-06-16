package Inheritance;

public class Ex1Dog extends Ex1Animal {

	Ex1Dog(String name, String breed) {
		super(name, breed);
	}

	public static void main(String[] args) {
		Ex1Dog dog = new Ex1Dog("TOmmy", "German Shephard");
		dog.sound("Bow Bow!");
		System.out.println(dog);
	}

}
