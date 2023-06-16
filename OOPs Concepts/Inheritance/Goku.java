package Inheritance;

public class Goku {
	String race;
	int age;

	Goku(String race, int age) {
		this.race = race;
		this.age = age;
	}

	public void printGoku() {
		System.out.println("Goku is a " + race + " Race and Lives in Earth, His age is " + age);
	}

}
