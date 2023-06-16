package Relationship;

public class Son {
	String name;
	int age;
	int education;

	Son(String name, int age, int education) {
		this.name = name;
		this.age = age;
		this.education = education;
	}

	public void printDetails() {
		Parents p2 = new Parents();
		System.out.println("Father's Name: " + p2.father + "\t Mother's Name: " + p2.mother);
		System.out.println(name + " is  of age " + age + " and studies in " + education + " Class");
		System.out.println("---------------------------------------------------------");
	}

}
