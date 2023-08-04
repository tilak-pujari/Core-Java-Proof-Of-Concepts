package Relationship;

public class Parents {
	Son s;
	String father = "Goku";
	String mother = "Chichi";

	Parents() {

	}
	Parents(String father, String mother) {
		this.father = father;
		this.mother = mother;
	}

	Parents(Son s) {
		this.s = s;
	}

	public static void main(String[] args) {
		Parents p = new Parents(new Son("Gohan", 18, 10));
		Parents p1 = new Parents(new Son("Gotenks", 8, 2));
		p.s.printDetails();
		p1.s.printDetails();
	}

}
