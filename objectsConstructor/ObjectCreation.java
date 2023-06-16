/*		Objects--->entity exists in real world
 * 	   Members->1]Non Static Variables
 * 				2]Non Static Methods
 * 				3]Non Static Initializers
 * 				4]COnstructors
 * 1]Non Static Variables ---- accessible only after object creations
 * 							-- stored in Heap Area
 * 
 * 2]Non Static Methods  -- -- called refVariableName.methodName
 * 							-- loaded in method Area and ref stored in class Static Area and Heap Area
 *  
 * 3]Non Static Initializers-- executes during object creations
 * 							-- these are Startup instructions 
 * 							-- executes from top to bottom order
 * */
package objectsConstructor;

public class ObjectCreation {
	String name;
	int rank;
	{
		rank = 46;
		System.out.println("1st " + rank);
	}
	{
		System.out.println("2nd " + name);
	}
	{
		name = "Kakarot";
	}

	public void print() {
		System.out.println("Name of Character is " + name);
		System.out.println("Rank of the character is " + rank);
	}

	public static void main(String[] args) {
		ObjectCreation c = new ObjectCreation();
		System.out.println("4th " + c.name);
		System.out.println("5th " + c.rank);
		c.print();

	}

	{
		System.out.println("3rd " + name);
	}

}
