package Inheritance;

public class Earth {
	Human h;

	Earth(Human h) {
		this.h = h;
	}

	public static void main(String[] args) {
		Earth e = new Earth(new Human("Krrishh", 32));
		System.out.println(e.h.name);
		System.out.println(e.h.age);
		e.h.m1();
	}

}
