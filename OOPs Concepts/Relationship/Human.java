package Relationship;

public class Human {
	Mobile m;

	Human(Mobile m) {
		this.m = m;
	}

	public static void main(String[] args) {
		Human h = new Human(new Mobile("Realme", 11.5, 6, 128.7));
		h.m.Print();

	}

}
