package Encapsulation;

public class Chandan {

	String subject;// global non static variables
	double salary;

	Chandan() {// no argument constructor
	}

	Chandan(String subject, double salary) {// parameterized
		this.subject = subject;
		this.salary = salary;
	}

	public void printChandan(String greet) {// non static method
		System.out.println(greet);
		System.out.println("Subject name is:" + subject);
		System.out.println("Salary is " + salary + " LPA");
	}

	public static void main(String[] args) {

		Chandan c = new Chandan("Core Java", 7.5);// actual & formal args matching
		c.printChandan("\nWelcome to Java Programming.......!\n");// provide string actual arg

		Chandan c1 = new Chandan();
		System.out.println(c1.subject + "\t" + c1.salary);// default values
	}
}
