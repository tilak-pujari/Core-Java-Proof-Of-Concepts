/* Is A RelationShip
 
 
 */
package Inheritance;

public class Daughter extends Father {
	String scooty = "Activa";

	public void m4() {
		System.out.println("Daughter Class!!!");
	}

	public static void main(String[] args) {
		Daughter d = new Daughter();

		System.out.println(d.balance);
		System.out.println(d.car);
		d.m1();
		System.out.println(d.bike);
		System.out.println(d.property);
		d.m2();
		System.out.println(d.scooty);
		d.m4();

	}

}
