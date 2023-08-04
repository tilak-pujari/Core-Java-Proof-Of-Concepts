/* Constructor chaining
 				-- used to call Constructor inside another constructor	
 				-- called with help of this() call statement*/
package objectsConstructor;
public class ConstructChain {
	String name;
	double salary;
	int age;
	ConstructChain() {
	}
	ConstructChain(String name) {
		this.name = name;
	}
	ConstructChain(int age) {
		this.age = age;
	}
	ConstructChain(String name, double salary) {
		this(name);
		this.salary = salary;
	}
	ConstructChain(String name, double salary, int age) {
		this(name, salary);
		this.age = age;
	}
	public static void main(String[] args) {
		ConstructChain c = new ConstructChain();
		ConstructChain c1 = new ConstructChain("Sasuke");
		ConstructChain c2 = new ConstructChain("Naruto", 44.5);
		ConstructChain c3 = new ConstructChain(5);
		ConstructChain c4 = new ConstructChain("Kaguya", 445.5, 1200);
		System.out.println("Name :\t" + c.name + "\tSalary: " + c.salary + "\tAge: " + c.age);
		System.out.println("Name :\t" + c1.name + "\tSalary: " + c1.salary + "\tAge: " + c1.age);
		System.out.println("Name :\t" + c2.name + "\tSalary: " + c2.salary + "\tAge: " + c2.age);
		System.out.println("Name :\t" + c3.name + "\tSalary: " + c3.salary + "\tAge: " + c3.age);
		System.out.println("Name :\t" + c4.name + "\tSalary: " + c4.salary + "\tAge: " + c4.age);
	}
}