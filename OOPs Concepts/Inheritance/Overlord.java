/*
   Super()---> calling constructor from parent class to child class
   it should be first statemment in a constructor
   we can only create constructor in child class with the help of super()
   it is only used inside child class*/
package Inheritance;

public class Overlord {
	String name;
	int members;

	Overlord(String name, int members) {
		this.name = name;
		this.members = members;
	}

	public void m1() {
		System.out.println("Ains Owl Gown Banzai !!!!");
	}

}
