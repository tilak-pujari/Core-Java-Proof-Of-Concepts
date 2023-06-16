package Inheritance;

public class Ains extends Overlord {
	int level;

	Ains(String name, int members, int level) {
		super(name, members);
		this.level = level;
	}

	public static void main(String[] args) {
		Ains a = new Ains("Albedo", 1, 11);
		a.m1();
		System.out.println("Name of Member: " + a.name + "\nMember Rank:" + a.members + "\nCurent Level" + a.level);

	}

}
