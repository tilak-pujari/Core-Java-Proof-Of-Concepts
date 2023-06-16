package Inheritance;

public class Human {
	String name;
	int age;

	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void m1() {
		System.out.println("Name of Human is " + name + " and age is " + age + " Years");
	}

}
