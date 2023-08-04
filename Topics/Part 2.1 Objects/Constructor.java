/* 		Constructor Overloading---same name-- different formal args
				constructor chaining-- Calling one constructor in another constructor
 										1st statement must be this()/super()
 */
package objectsConstructor;

public class Constructor {
	String name;
	int age;
	// No argument Constructor
	Constructor() {
	}
	// Parameterized Constructor---consists of formal arguments
	Constructor(String name) {
		this.name = name;
	}
	Constructor(int age) {
		this.age = age;
	}
	Constructor(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		Constructor c = new Constructor();
		Constructor c1 = new Constructor("Goku");
		Constructor c2 = new Constructor(55);
		Constructor c3 = new Constructor("Kakarot", 67);
		System.out.println(c.name + "\t" + c.age);
		System.out.println(c1.name + "\t" + c1.age);
		System.out.println(c2.name + "\t" + c2.age);
		System.out.println(c3.name + "\t" + c3.age);
	}
}
