/* Understanding Reference Variable
    one object is refered with multiple ref variable*/
package Inheritance;

public class Program1 {
	int age;

	Program1(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Program1 p = new Program1(55);
		Program1 p2 = p;
		Program1 p3 = p;
		System.out.println(p.age);
		System.out.println(p2.age);
		System.out.println(p3.age);
	}
}
