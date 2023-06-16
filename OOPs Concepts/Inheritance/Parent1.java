package Inheritance;

public class Parent1 {
	String name;
	int age;

	Parent1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void details() {
		System.out.println("This is a Parent Class!!!!!!!!!");
		System.out.println("Name of a Parent is: " + name + "\nAge of Parent is:" + age);
	}

}
