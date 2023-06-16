package Abstraction;

public class AnimalRunner {

	public static void main(String[] args) {

		Animal[] animal = { new Cat(), new Dog() };
		for (Animal obj : animal) {
			obj.bark();
		}

	}

}
