package Inheritance;

public class Gohan extends Goku {
	String child;
	int age2;

	Gohan(String race, int age, String child, int age2) {
		super(race, age);
		this.child = child;
		this.age2 = age2;
	}

	public void printGohan() {
		System.out.println(
				"Gohan is son of Goku a " + race + " his age " + age2 + " Years & he has child named " + child);
	}

	public static void main(String[] args) {
		Goku g1 = new Gohan("Saiyan", 76, "Pan", 31);// upcasting
		g1.printGoku();
		System.out.println(g1.race + "\n" + g1.age);
		Gohan g2 = (Gohan) g1;// downcasting
		g2.printGoku();
		g2.printGohan();
		System.out.println(g2.race + "\n" + g2.age);
		System.out.println(g2.child + "\n" + g2.age2);
	}
}
