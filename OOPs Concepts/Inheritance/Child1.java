package Inheritance;

public class Child1 extends Parent1 {
	String cname;
	int cage;

	public void CDetails() {
		System.out.println("Child Name is:" + cname + "\nChild age is " + cage);
	}

	Child1(String name, int age) {
		super(name, age);

	}

	Child1(String name, int age, String cname, int cage) {
		this(name, age);
		this.cname = cname;
		this.cage = cage;
	}

	public static void main(String[] args) {
		Parent1 p1 = new Child1("Yor", 27);
		Parent1 p2 = new Child1("Loid", 30, "Anya", 8);
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.details();
		// p1.CDetails();
		System.out.println(p2.name);
		System.out.println(p2.age);
		p2.details();
		// p2.CDetails();

	}

}
